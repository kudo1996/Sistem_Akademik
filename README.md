# Tugas2 - Java Project with Javadocs

## Project Description
This project contains Java classes for managing different types of members (Mahasiswa, Dosen, Karyawan) in an educational system.

## Project Structure
```
Tugas2/
├── src/
│   └── tugas2/
│       ├── Member.java (Abstract base class)
│       ├── Mahasiswa.java (Student class)
│       ├── Dosen.java (Faculty class)
│       ├── Karyawan.java (Staff class)
│       ├── Admin.java (Administrator class)
│       └── Main.java (Main application)
├── docs/ (Generated Javadocs HTML files)
├── build.xml (Ant build file)
└── README.md
```

## How to Generate Javadocs HTML

### Prerequisites
- Java Development Kit (JDK) must be installed
- Make sure `javadoc` command is available in your PATH

### Method 1: Using Command Line
```bash
# Navigate to project root directory
cd Tugas2

# Generate Javadocs HTML files
javadoc -d docs -sourcepath src -subpackages tugas2

# This will create HTML files in the docs/ directory
```

### Method 2: Using NetBeans IDE
1. Right-click on the project in NetBeans
2. Select "Generate Javadoc"
3. Choose output directory (docs/)
4. Click "Generate"

### Method 3: Using Ant Build
```bash
# If you have Ant installed
ant javadoc
```

## Javadocs HTML Format Explanation

When you run the javadoc command, it generates HTML files including:

1. **index.html** - Main documentation page
2. **Package pages** - Overview of each package
3. **Class pages** - Detailed documentation for each class
4. **Method documentation** - All public methods with parameters and return types
5. **CSS files** - Styling for the documentation

### What the HTML Documentation Contains:
- Class hierarchy and inheritance
- Method signatures and descriptions
- Parameter descriptions
- Return value descriptions
- Author information (if provided)
- Version information (if provided)
- Cross-references between classes

## Viewing the Documentation
After generation, open `docs/index.html` in any web browser to view the complete API documentation.

## Classes Overview

### Member (Abstract)
Base class for all member types with common attributes like name, address, and email.

### Mahasiswa
Represents a student with additional fields for NIM (student ID) and program of study.

### Dosen
Represents a faculty member.

### Karyawan
Represents a staff member.

### Admin
Represents an administrator.

### Main
Main application class with menu system.

## Usage
The application provides a console-based menu system for managing different types of members in an educational institution.