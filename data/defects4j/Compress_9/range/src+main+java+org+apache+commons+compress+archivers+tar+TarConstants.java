{
  "filepath": "/tmp/Compress-9b/src/main/java/org/apache/commons/compress/archivers/tar/TarConstants.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarConstants",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 290,
      "comment": " CheckStyle:InterfaceIsTypeCheck OFF (bc)"
    },
    {
      "type": "field",
      "varNames": [
        "FORMAT_OLDGNU"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": "\n     * GNU format as per before tar 1.12.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FORMAT_POSIX"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Pure Posix format.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "NAMELEN"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * The length of the name field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MODELEN"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * The length of the mode field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UIDLEN"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * The length of the user id field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "GIDLEN"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * The length of the group id field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CHKSUMLEN"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * The length of the checksum field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SIZELEN"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * The length of the size field in a header buffer.\n     * Includes the trailing space or NUL.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MAXSIZE"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * The maximum size of a file in a tar archive (That\u0027s 11 sevens, octal).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_OFFSET"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Offset of start of magic field within header record "
    },
    {
      "type": "field",
      "varNames": [
        "MAGICLEN"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n     * The length of the magic field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "VERSION_OFFSET"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Offset of start of magic field within header record "
    },
    {
      "type": "field",
      "varNames": [
        "VERSIONLEN"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * Previously this was regarded as part of \"magic\" field, but it is separate.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MODTIMELEN"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n     * The length of the modification time field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UNAMELEN"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n     * The length of the user name field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "GNAMELEN"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": "\n     * The length of the group name field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEVLEN"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": "\n     * The length of each of the device fields (major and minor) in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PREFIXLEN"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": "\n     * Length of the prefix field.\n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "ATIMELEN_GNU"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": "\n     * The length of the access time field in an old GNU header buffer.\n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "CTIMELEN_GNU"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": "\n     * The length of the created time field in an old GNU header buffer.\n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "OFFSETLEN_GNU"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": "\n     * The length of the multivolume start offset field in an old GNU header buffer. \n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "LONGNAMESLEN_GNU"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": "\n     * The length of the long names field in an old GNU header buffer. \n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "PAD2LEN_GNU"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": "\n     * The length of the padding field in an old GNU header buffer. \n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "SPARSELEN_GNU"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": "\n     * The sum of the length of all sparse headers in an old GNU header buffer. \n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISEXTENDEDLEN_GNU"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": "\n     * The length of the is extension field in an old GNU header buffer. \n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "REALSIZELEN_GNU"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": "\n     * The length of the real size field in an old GNU header buffer. \n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "SPARSELEN_GNU_SPARSE"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": "\n     * The sum of the length of all sparse headers in a sparse header buffer. \n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISEXTENDEDLEN_GNU_SPARSE"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": "\n     * The length of the is extension field in a sparse header buffer. \n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_OLDNORM"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": "\n     * LF_ constants represent the \"link flag\" of an entry, or more commonly,\n     * the \"entry type\". This is the \"old way\" of indicating a normal file.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_NORMAL"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": "\n     * Normal file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_LINK"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": "\n     * Link file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_SYMLINK"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": "\n     * Symbolic link file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_CHR"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": "\n     * Character device file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_BLK"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": "\n     * Block device file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_DIR"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": "\n     * Directory file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_FIFO"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": "\n     * FIFO (pipe) file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_CONTIG"
      ],
      "begin_line": 220,
      "end_line": 220,
      "comment": "\n     * Contiguous file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_GNUTYPE_LONGNAME"
      ],
      "begin_line": 225,
      "end_line": 225,
      "comment": "\n     * Identifies the *next* file on the tape as having a long name.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_GNUTYPE_SPARSE"
      ],
      "begin_line": 231,
      "end_line": 231,
      "comment": "\n     * Sparse file type.\n     * @since Apache Commons Compress 1.1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_PAX_EXTENDED_HEADER_LC"
      ],
      "begin_line": 239,
      "end_line": 239,
      "comment": "\n     * Identifies the entry as a Pax extended header.\n     * @since Apache Commons Compress 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_PAX_EXTENDED_HEADER_UC"
      ],
      "begin_line": 246,
      "end_line": 246,
      "comment": "\n     * Identifies the entry as a Pax extended header (SunOS tar -E).\n     *\n     * @since Apache Commons Compress 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_PAX_GLOBAL_EXTENDED_HEADER"
      ],
      "begin_line": 253,
      "end_line": 253,
      "comment": "\n     * Identifies the entry as a Pax global extended header.\n     *\n     * @since Apache Commons Compress 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_POSIX"
      ],
      "begin_line": 258,
      "end_line": 258,
      "comment": "\n     * The magic tag representing a POSIX tar archive.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "VERSION_POSIX"
      ],
      "begin_line": 259,
      "end_line": 259,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_GNU"
      ],
      "begin_line": 264,
      "end_line": 264,
      "comment": "\n     * The magic tag representing a GNU tar archive.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "VERSION_GNU_SPACE"
      ],
      "begin_line": 266,
      "end_line": 266,
      "comment": " Appear to be two possible GNU versions"
    },
    {
      "type": "field",
      "varNames": [
        "VERSION_GNU_ZERO"
      ],
      "begin_line": 267,
      "end_line": 267,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_ANT"
      ],
      "begin_line": 274,
      "end_line": 274,
      "comment": "\n     * The magic tag representing an Ant tar archive.\n     *\n     * @since Apache Commons Compress 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "VERSION_ANT"
      ],
      "begin_line": 283,
      "end_line": 283,
      "comment": " so assume the version is 2 nulls"
    },
    {
      "type": "field",
      "varNames": [
        "GNU_LONGLINK"
      ],
      "begin_line": 288,
      "end_line": 288,
      "comment": " TODO rename as LONGLINK_GNU ?"
    }
  ]
}