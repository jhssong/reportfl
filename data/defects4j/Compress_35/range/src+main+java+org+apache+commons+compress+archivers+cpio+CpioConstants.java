{
  "filepath": "/tmp/Compress-35b/src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CpioConstants",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 143,
      "comment": "\n * All constants needed by CPIO.\n * \n * based on code from the jRPM project (jrpm.sourceforge.net) \n * \n "
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_NEW"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": " magic number of a cpio entry in the new format "
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_NEW_CRC"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " magic number of a cpio entry in the new format with crc "
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_OLD_ASCII"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " magic number of a cpio entry in the old ascii format "
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_OLD_BINARY"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " magic number of a cpio entry in the old binary format "
    },
    {
      "type": "field",
      "varNames": [
        "FORMAT_NEW"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " write/read a CPIOArchiveEntry in the new format "
    },
    {
      "type": "field",
      "varNames": [
        "FORMAT_NEW_CRC"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " write/read a CPIOArchiveEntry in the new format with crc "
    },
    {
      "type": "field",
      "varNames": [
        "FORMAT_OLD_ASCII"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " write/read a CPIOArchiveEntry in the old ascii format "
    },
    {
      "type": "field",
      "varNames": [
        "FORMAT_OLD_BINARY"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " write/read a CPIOArchiveEntry in the old binary format "
    },
    {
      "type": "field",
      "varNames": [
        "FORMAT_NEW_MASK"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Mask for both new formats "
    },
    {
      "type": "field",
      "varNames": [
        "FORMAT_OLD_MASK"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Mask for both old formats "
    },
    {
      "type": "field",
      "varNames": [
        "S_IFMT"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Mask for all file type bits. "
    },
    {
      "type": "field",
      "varNames": [
        "C_ISSOCK"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Defines a socket "
    },
    {
      "type": "field",
      "varNames": [
        "C_ISLNK"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Defines a symbolic link "
    },
    {
      "type": "field",
      "varNames": [
        "C_ISNWK"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " HP/UX network special (C_ISCTG) "
    },
    {
      "type": "field",
      "varNames": [
        "C_ISREG"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Defines a regular file "
    },
    {
      "type": "field",
      "varNames": [
        "C_ISBLK"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Defines a block device "
    },
    {
      "type": "field",
      "varNames": [
        "C_ISDIR"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Defines a directory "
    },
    {
      "type": "field",
      "varNames": [
        "C_ISCHR"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " Defines a character device "
    },
    {
      "type": "field",
      "varNames": [
        "C_ISFIFO"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " Defines a pipe "
    },
    {
      "type": "field",
      "varNames": [
        "C_ISUID"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " Set user ID "
    },
    {
      "type": "field",
      "varNames": [
        "C_ISGID"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Set group ID "
    },
    {
      "type": "field",
      "varNames": [
        "C_ISVTX"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " On directories, restricted deletion flag. "
    },
    {
      "type": "field",
      "varNames": [
        "C_IRUSR"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " Permits the owner of a file to read the file "
    },
    {
      "type": "field",
      "varNames": [
        "C_IWUSR"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " Permits the owner of a file to write to the file "
    },
    {
      "type": "field",
      "varNames": [
        "C_IXUSR"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " Permits the owner of a file to execute the file or to search the directory "
    },
    {
      "type": "field",
      "varNames": [
        "C_IRGRP"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " Permits a file\u0027s group to read the file "
    },
    {
      "type": "field",
      "varNames": [
        "C_IWGRP"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " Permits a file\u0027s group to write to the file "
    },
    {
      "type": "field",
      "varNames": [
        "C_IXGRP"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": " Permits a file\u0027s group to execute the file or to search the directory "
    },
    {
      "type": "field",
      "varNames": [
        "C_IROTH"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " Permits others to read the file "
    },
    {
      "type": "field",
      "varNames": [
        "C_IWOTH"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " Permits others to write to the file "
    },
    {
      "type": "field",
      "varNames": [
        "C_IXOTH"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " Permits others to execute the file or to search the directory "
    },
    {
      "type": "field",
      "varNames": [
        "CPIO_TRAILER"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " The special trailer marker "
    },
    {
      "type": "field",
      "varNames": [
        "BLOCK_SIZE"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": "\n     * The default block size.\n     * \n     * @since 1.1\n     "
    }
  ]
}