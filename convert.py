import os
import re

root_dir = r'D:\TA OOPJ'  # Change this to your root assignments folder

ext_to_lang = {
    '.c': 'c',
    '.cpp': 'cpp',
    '.java': 'java',
    '.py': 'python',
    '.js': 'javascript',
    '.html': 'html',
    '.css': 'css',
    '.cs': 'csharp',
    '.txt': '',
}

markdown_lines = ["# All Lab Programs\n"]

def lab_sort_key(name):
    match = re.search(r'(\d+)', name)
    return int(match.group(1)) if match else float('inf')

def write_files_recursively(path, level=2):
    # level controls Markdown heading level (#, ##, ###, ...)
    entries = sorted(os.listdir(path))
    for entry in entries:
        full_path = os.path.join(path, entry)
        if os.path.isdir(full_path):
            markdown_lines.append("\n" + "#"*(level) + f" {entry}\n")
            write_files_recursively(full_path, level + 1)
        elif os.path.isfile(full_path):
            _, ext = os.path.splitext(entry)
            lang = ext_to_lang.get(ext.lower(), '')
            markdown_lines.append(f"\n**{entry}**\n")
            markdown_lines.append(f"```{lang}")
            try:
                with open(full_path, 'r', encoding='utf-8', errors='ignore') as f:
                    content = f.read().strip()
                markdown_lines.append(content)
            except Exception as e:
                markdown_lines.append(f"// Error reading file: {e}")
            markdown_lines.append("```\n")

lab_folders = sorted([f for f in os.listdir(root_dir) if os.path.isdir(os.path.join(root_dir, f))],
                     key=lab_sort_key)

for lab_folder in lab_folders:
    lab_path = os.path.join(root_dir, lab_folder)
    markdown_lines.append("\n---\n")
    markdown_lines.append(f"## {lab_folder}\n")
    write_files_recursively(lab_path)

output_md_path = os.path.join(root_dir, "Lab_Progr.md")
with open(output_md_path, "w", encoding="utf-8") as f:
    f.write('\n'.join(markdown_lines))

print(f"Markdown saved to: {output_md_path}")
