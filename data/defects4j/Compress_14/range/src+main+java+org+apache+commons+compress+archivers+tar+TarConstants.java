{
  "filepath": "/tmp/Compress-14b/src/main/java/org/apache/commons/compress/archivers/tar/TarConstants.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarConstants",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 298,
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
        "MAXID"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * The maximum value of gid/uid in a tar archive which can\n     * be expressed in octal char notation (that\u0027s 7 sevens, octal).\n     * @since 1.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CHKSUMLEN"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * The length of the checksum field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SIZELEN"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n     * The length of the size field in a header buffer.\n     * Includes the trailing space or NUL.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MAXSIZE"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * The maximum size of a file in a tar archive \n     * which can be expressed in octal char notation (that\u0027s 11 sevens, octal).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_OFFSET"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Offset of start of magic field within header record "
    },
    {
      "type": "field",
      "varNames": [
        "MAGICLEN"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * The length of the magic field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "VERSION_OFFSET"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " Offset of start of magic field within header record "
    },
    {
      "type": "field",
      "varNames": [
        "VERSIONLEN"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": "\n     * Previously this was regarded as part of \"magic\" field, but it is separate.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MODTIMELEN"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": "\n     * The length of the modification time field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UNAMELEN"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * The length of the user name field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "GNAMELEN"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": "\n     * The length of the group name field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEVLEN"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": "\n     * The length of each of the device fields (major and minor) in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PREFIXLEN"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": "\n     * Length of the prefix field.\n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "ATIMELEN_GNU"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": "\n     * The length of the access time field in an old GNU header buffer.\n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "CTIMELEN_GNU"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": "\n     * The length of the created time field in an old GNU header buffer.\n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "OFFSETLEN_GNU"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": "\n     * The length of the multivolume start offset field in an old GNU header buffer. \n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "LONGNAMESLEN_GNU"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": "\n     * The length of the long names field in an old GNU header buffer. \n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "PAD2LEN_GNU"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": "\n     * The length of the padding field in an old GNU header buffer. \n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "SPARSELEN_GNU"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": "\n     * The sum of the length of all sparse headers in an old GNU header buffer. \n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISEXTENDEDLEN_GNU"
      ],
      "begin_line": 164,
      "end_line": 164,
      "comment": "\n     * The length of the is extension field in an old GNU header buffer. \n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "REALSIZELEN_GNU"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": "\n     * The length of the real size field in an old GNU header buffer. \n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "SPARSELEN_GNU_SPARSE"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": "\n     * The sum of the length of all sparse headers in a sparse header buffer. \n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISEXTENDEDLEN_GNU_SPARSE"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": "\n     * The length of the is extension field in a sparse header buffer. \n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_OLDNORM"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": "\n     * LF_ constants represent the \"link flag\" of an entry, or more commonly,\n     * the \"entry type\". This is the \"old way\" of indicating a normal file.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_NORMAL"
      ],
      "begin_line": 193,
      "end_line": 193,
      "comment": "\n     * Normal file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_LINK"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": "\n     * Link file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_SYMLINK"
      ],
      "begin_line": 203,
      "end_line": 203,
      "comment": "\n     * Symbolic link file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_CHR"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": "\n     * Character device file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_BLK"
      ],
      "begin_line": 213,
      "end_line": 213,
      "comment": "\n     * Block device file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_DIR"
      ],
      "begin_line": 218,
      "end_line": 218,
      "comment": "\n     * Directory file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_FIFO"
      ],
      "begin_line": 223,
      "end_line": 223,
      "comment": "\n     * FIFO (pipe) file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_CONTIG"
      ],
      "begin_line": 228,
      "end_line": 228,
      "comment": "\n     * Contiguous file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_GNUTYPE_LONGNAME"
      ],
      "begin_line": 233,
      "end_line": 233,
      "comment": "\n     * Identifies the *next* file on the tape as having a long name.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_GNUTYPE_SPARSE"
      ],
      "begin_line": 239,
      "end_line": 239,
      "comment": "\n     * Sparse file type.\n     * @since Apache Commons Compress 1.1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_PAX_EXTENDED_HEADER_LC"
      ],
      "begin_line": 247,
      "end_line": 247,
      "comment": "\n     * Identifies the entry as a Pax extended header.\n     * @since Apache Commons Compress 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_PAX_EXTENDED_HEADER_UC"
      ],
      "begin_line": 254,
      "end_line": 254,
      "comment": "\n     * Identifies the entry as a Pax extended header (SunOS tar -E).\n     *\n     * @since Apache Commons Compress 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_PAX_GLOBAL_EXTENDED_HEADER"
      ],
      "begin_line": 261,
      "end_line": 261,
      "comment": "\n     * Identifies the entry as a Pax global extended header.\n     *\n     * @since Apache Commons Compress 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_POSIX"
      ],
      "begin_line": 266,
      "end_line": 266,
      "comment": "\n     * The magic tag representing a POSIX tar archive.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "VERSION_POSIX"
      ],
      "begin_line": 267,
      "end_line": 267,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_GNU"
      ],
      "begin_line": 272,
      "end_line": 272,
      "comment": "\n     * The magic tag representing a GNU tar archive.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "VERSION_GNU_SPACE"
      ],
      "begin_line": 274,
      "end_line": 274,
      "comment": " Appear to be two possible GNU versions"
    },
    {
      "type": "field",
      "varNames": [
        "VERSION_GNU_ZERO"
      ],
      "begin_line": 275,
      "end_line": 275,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_ANT"
      ],
      "begin_line": 282,
      "end_line": 282,
      "comment": "\n     * The magic tag representing an Ant tar archive.\n     *\n     * @since Apache Commons Compress 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "VERSION_ANT"
      ],
      "begin_line": 291,
      "end_line": 291,
      "comment": " so assume the version is 2 nulls"
    },
    {
      "type": "field",
      "varNames": [
        "GNU_LONGLINK"
      ],
      "begin_line": 296,
      "end_line": 296,
      "comment": " TODO rename as LONGLINK_GNU ?"
    }
  ]
}