{
  "filepath": "/tmp/Compress-44b/src/main/java/org/apache/commons/compress/archivers/tar/TarConstants.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarConstants",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 358,
      "comment": " CheckStyle:InterfaceIsTypeCheck OFF (bc)"
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RCDSIZE"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Default record size "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BLKSIZE"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Default block size "
    },
    {
      "type": "field",
      "varNames": [
        "FORMAT_OLDGNU"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * GNU format as per before tar 1.12.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FORMAT_POSIX"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Pure Posix format.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FORMAT_XSTAR"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * xstar format used by Jörg Schilling\u0027s star.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "NAMELEN"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * The length of the name field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MODELEN"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * The length of the mode field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UIDLEN"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * The length of the user id field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "GIDLEN"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * The length of the group id field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MAXID"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n     * The maximum value of gid/uid in a tar archive which can\n     * be expressed in octal char notation (that\u0027s 7 sevens, octal).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CHKSUMLEN"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * The length of the checksum field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CHKSUM_OFFSET"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * Offset of the checksum field within header record.\n     * @since 1.5\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SIZELEN"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": "\n     * The length of the size field in a header buffer.\n     * Includes the trailing space or NUL.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MAXSIZE"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n     * The maximum size of a file in a tar archive \n     * which can be expressed in octal char notation (that\u0027s 11 sevens, octal).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_OFFSET"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " Offset of start of magic field within header record "
    },
    {
      "type": "field",
      "varNames": [
        "MAGICLEN"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n     * The length of the magic field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "VERSION_OFFSET"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " Offset of start of magic field within header record "
    },
    {
      "type": "field",
      "varNames": [
        "VERSIONLEN"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n     * Previously this was regarded as part of \"magic\" field, but it is separate.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MODTIMELEN"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n     * The length of the modification time field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UNAMELEN"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": "\n     * The length of the user name field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "GNAMELEN"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": "\n     * The length of the group name field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEVLEN"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": "\n     * The length of each of the device fields (major and minor) in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PREFIXLEN"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": "\n     * Length of the prefix field.\n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "ATIMELEN_GNU"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": "\n     * The length of the access time field in an old GNU header buffer.\n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "CTIMELEN_GNU"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": "\n     * The length of the created time field in an old GNU header buffer.\n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "OFFSETLEN_GNU"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": "\n     * The length of the multivolume start offset field in an old GNU header buffer. \n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "LONGNAMESLEN_GNU"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": "\n     * The length of the long names field in an old GNU header buffer. \n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "PAD2LEN_GNU"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": "\n     * The length of the padding field in an old GNU header buffer. \n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "SPARSELEN_GNU"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": "\n     * The sum of the length of all sparse headers in an old GNU header buffer. \n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISEXTENDEDLEN_GNU"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": "\n     * The length of the is extension field in an old GNU header buffer. \n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "REALSIZELEN_GNU"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": "\n     * The length of the real size field in an old GNU header buffer. \n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "SPARSELEN_GNU_SPARSE"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": "\n     * The sum of the length of all sparse headers in a sparse header buffer. \n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISEXTENDEDLEN_GNU_SPARSE"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": "\n     * The length of the is extension field in a sparse header buffer. \n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_OLDNORM"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": "\n     * LF_ constants represent the \"link flag\" of an entry, or more commonly,\n     * the \"entry type\". This is the \"old way\" of indicating a normal file.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_NORMAL"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": "\n     * Normal file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_LINK"
      ],
      "begin_line": 214,
      "end_line": 214,
      "comment": "\n     * Link file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_SYMLINK"
      ],
      "begin_line": 219,
      "end_line": 219,
      "comment": "\n     * Symbolic link file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_CHR"
      ],
      "begin_line": 224,
      "end_line": 224,
      "comment": "\n     * Character device file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_BLK"
      ],
      "begin_line": 229,
      "end_line": 229,
      "comment": "\n     * Block device file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_DIR"
      ],
      "begin_line": 234,
      "end_line": 234,
      "comment": "\n     * Directory file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_FIFO"
      ],
      "begin_line": 239,
      "end_line": 239,
      "comment": "\n     * FIFO (pipe) file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_CONTIG"
      ],
      "begin_line": 244,
      "end_line": 244,
      "comment": "\n     * Contiguous file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_GNUTYPE_LONGLINK"
      ],
      "begin_line": 249,
      "end_line": 249,
      "comment": "\n     * Identifies the *next* file on the tape as having a long linkname.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_GNUTYPE_LONGNAME"
      ],
      "begin_line": 254,
      "end_line": 254,
      "comment": "\n     * Identifies the *next* file on the tape as having a long name.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_GNUTYPE_SPARSE"
      ],
      "begin_line": 260,
      "end_line": 260,
      "comment": "\n     * Sparse file type.\n     * @since 1.1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_PAX_EXTENDED_HEADER_LC"
      ],
      "begin_line": 268,
      "end_line": 268,
      "comment": "\n     * Identifies the entry as a Pax extended header.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_PAX_EXTENDED_HEADER_UC"
      ],
      "begin_line": 275,
      "end_line": 275,
      "comment": "\n     * Identifies the entry as a Pax extended header (SunOS tar -E).\n     *\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_PAX_GLOBAL_EXTENDED_HEADER"
      ],
      "begin_line": 282,
      "end_line": 282,
      "comment": "\n     * Identifies the entry as a Pax global extended header.\n     *\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_POSIX"
      ],
      "begin_line": 287,
      "end_line": 287,
      "comment": "\n     * The magic tag representing a POSIX tar archive.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "VERSION_POSIX"
      ],
      "begin_line": 288,
      "end_line": 288,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_GNU"
      ],
      "begin_line": 293,
      "end_line": 293,
      "comment": "\n     * The magic tag representing a GNU tar archive.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "VERSION_GNU_SPACE"
      ],
      "begin_line": 295,
      "end_line": 295,
      "comment": " Appear to be two possible GNU versions"
    },
    {
      "type": "field",
      "varNames": [
        "VERSION_GNU_ZERO"
      ],
      "begin_line": 296,
      "end_line": 296,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_ANT"
      ],
      "begin_line": 303,
      "end_line": 303,
      "comment": "\n     * The magic tag representing an Ant tar archive.\n     *\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "VERSION_ANT"
      ],
      "begin_line": 312,
      "end_line": 312,
      "comment": " so assume the version is 2 nulls"
    },
    {
      "type": "field",
      "varNames": [
        "GNU_LONGLINK"
      ],
      "begin_line": 317,
      "end_line": 317,
      "comment": " TODO rename as LONGLINK_GNU ?"
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_XSTAR"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": "\n     * The magix string used in the last four bytes of the header to\n     * identify the xstar format.\n     * @since 1.11\n     "
    },
    {
      "type": "field",
      "varNames": [
        "XSTAR_MAGIC_OFFSET"
      ],
      "begin_line": 330,
      "end_line": 330,
      "comment": "\n     * Offset inside the header for the xstar magic bytes.\n     * @since 1.11\n     "
    },
    {
      "type": "field",
      "varNames": [
        "XSTAR_MAGIC_LEN"
      ],
      "begin_line": 336,
      "end_line": 336,
      "comment": "\n     * Length of the XSTAR magic.\n     * @since 1.11\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PREFIXLEN_XSTAR"
      ],
      "begin_line": 343,
      "end_line": 343,
      "comment": "\n     * Length of the prefix field in xstar archives.\n     * \n     * @since 1.11\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ATIMELEN_XSTAR"
      ],
      "begin_line": 350,
      "end_line": 350,
      "comment": "\n     * The length of the access time field in a xstar header buffer.\n     * \n     * @since 1.11\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CTIMELEN_XSTAR"
      ],
      "begin_line": 357,
      "end_line": 357,
      "comment": "\n     * The length of the created time field in a xstar header buffer.\n     * \n     * @since 1.11\n     "
    }
  ]
}