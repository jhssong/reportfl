{
  "filepath": "/tmp/Compress-1b/src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CpioConstants",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 125,
      "comment": "\n * All constants needed by CPIO.\n * \n * based on code from the jRPM project (jrpm.sourceforge.net) \n "
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_NEW"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": " magic number of a cpio entry in the new format "
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_NEW_CRC"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " magic number of a cpio entry in the new format with crc "
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_OLD_ASCII"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " magic number of a cpio entry in the old ascii format "
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_OLD_BINARY"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " magic number of a cpio entry in the old binary format "
    },
    {
      "type": "field",
      "varNames": [
        "FORMAT_NEW"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " write/read a CPIOArchiveEntry in the new format "
    },
    {
      "type": "field",
      "varNames": [
        "FORMAT_NEW_CRC"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " write/read a CPIOArchiveEntry in the new format with crc "
    },
    {
      "type": "field",
      "varNames": [
        "FORMAT_OLD_ASCII"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " write/read a CPIOArchiveEntry in the old ascii format "
    },
    {
      "type": "field",
      "varNames": [
        "FORMAT_OLD_BINARY"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " write/read a CPIOArchiveEntry in the old binary format "
    },
    {
      "type": "field",
      "varNames": [
        "FORMAT_NEW_MASK"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Mask for both new formats "
    },
    {
      "type": "field",
      "varNames": [
        "FORMAT_OLD_MASK"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Mask for both old formats "
    },
    {
      "type": "field",
      "varNames": [
        "S_IFMT"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Mask for all file type bits. "
    },
    {
      "type": "field",
      "varNames": [
        "C_ISDIR"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Defines a directory "
    },
    {
      "type": "field",
      "varNames": [
        "C_ISLNK"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Defines a symbolic link "
    },
    {
      "type": "field",
      "varNames": [
        "C_ISREG"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Defines a regular file "
    },
    {
      "type": "field",
      "varNames": [
        "C_ISFIFO"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Defines a pipe "
    },
    {
      "type": "field",
      "varNames": [
        "C_ISCHR"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Defines a character device "
    },
    {
      "type": "field",
      "varNames": [
        "C_ISBLK"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Defines a block device "
    },
    {
      "type": "field",
      "varNames": [
        "C_ISSOCK"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Defines a socket "
    },
    {
      "type": "field",
      "varNames": [
        "C_ISNWK"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " HP/UX network special (C_ISCTG) "
    },
    {
      "type": "field",
      "varNames": [
        "C_IRUSR"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Permits the owner of a file to read the file "
    },
    {
      "type": "field",
      "varNames": [
        "C_IWUSR"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Permits the owner of a file to write to the file "
    },
    {
      "type": "field",
      "varNames": [
        "C_IXUSR"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n     * Permits the owner of a file to execute the file or to search the file\u0027s\n     * directory\n     "
    },
    {
      "type": "field",
      "varNames": [
        "C_IRGRP"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Permits a file\u0027s group to read the file "
    },
    {
      "type": "field",
      "varNames": [
        "C_IWGRP"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Permits a file\u0027s group to write to the file "
    },
    {
      "type": "field",
      "varNames": [
        "C_IXGRP"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * Permits a file\u0027s group to execute the file or to search the file\u0027s\n     * directory\n     "
    },
    {
      "type": "field",
      "varNames": [
        "C_IROTH"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " Permits others to read the file "
    },
    {
      "type": "field",
      "varNames": [
        "C_IWOTH"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " Permits others to write to the file "
    },
    {
      "type": "field",
      "varNames": [
        "C_IXOTH"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " Permits others to execute the file or to search the file\u0027s directory "
    },
    {
      "type": "field",
      "varNames": [
        "C_ISUID"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " TODO document "
    },
    {
      "type": "field",
      "varNames": [
        "C_ISGID"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " TODO document "
    },
    {
      "type": "field",
      "varNames": [
        "C_ISVTX"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " TODO document "
    }
  ]
}