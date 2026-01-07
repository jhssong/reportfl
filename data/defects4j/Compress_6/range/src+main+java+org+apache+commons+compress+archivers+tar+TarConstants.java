{
  "filepath": "/tmp/Compress-6b/src/main/java/org/apache/commons/compress/archivers/tar/TarConstants.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarConstants",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 172,
      "comment": " CheckStyle:InterfaceIsTypeCheck OFF (bc)"
    },
    {
      "type": "field",
      "varNames": [
        "NAMELEN"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": "\n     * The length of the name field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MODELEN"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * The length of the mode field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UIDLEN"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * The length of the user id field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "GIDLEN"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * The length of the group id field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CHKSUMLEN"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * The length of the checksum field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SIZELEN"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * The length of the size field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MAXSIZE"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * The maximum size of a file in a tar archive (That\u0027s 11 sevens, octal).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_OFFSET"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Offset of start of magic field within header record "
    },
    {
      "type": "field",
      "varNames": [
        "MAGICLEN"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * The length of the magic field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "VERSION_OFFSET"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Offset of start of magic field within header record "
    },
    {
      "type": "field",
      "varNames": [
        "VERSIONLEN"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n     * Previously this was regarded as part of \"magic\" field, but it is separate.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MODTIMELEN"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * The length of the modification time field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UNAMELEN"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": "\n     * The length of the user name field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "GNAMELEN"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": "\n     * The length of the group name field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEVLEN"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * The length of each of the device fields (major and minor) in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PREFIXLEN"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": "\n     * Length of the prefix field.\n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_OLDNORM"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": "\n     * LF_ constants represent the \"link flag\" of an entry, or more commonly,\n     * the \"entry type\". This is the \"old way\" of indicating a normal file.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_NORMAL"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n     * Normal file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_LINK"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n     * Link file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_SYMLINK"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": "\n     * Symbolic link file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_CHR"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": "\n     * Character device file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_BLK"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": "\n     * Block device file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_DIR"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": "\n     * Directory file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_FIFO"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": "\n     * FIFO (pipe) file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_CONTIG"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": "\n     * Contiguous file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_POSIX"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": "\n     * The magic tag representing a POSIX tar archive.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "VERSION_POSIX"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_GNU"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": "\n     * The magic tag representing a GNU tar archive.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "VERSION_GNU_SPACE"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": " Appear to be two possible GNU versions"
    },
    {
      "type": "field",
      "varNames": [
        "VERSION_GNU_ZERO"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GNU_LONGLINK"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": " TODO rename as LONGLINK_GNU ?"
    },
    {
      "type": "field",
      "varNames": [
        "LF_GNUTYPE_LONGNAME"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": "\n     * Identifies the *next* file on the tape as having a long name.\n     "
    }
  ]
}