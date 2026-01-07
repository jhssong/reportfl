{
  "filepath": "/tmp/Compress-8b/src/main/java/org/apache/commons/compress/archivers/tar/TarConstants.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarConstants",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 212,
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
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * The length of the size field in a header buffer.\n     * Includes the trailing space or NUL.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MAXSIZE"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * The maximum size of a file in a tar archive (That\u0027s 11 sevens, octal).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_OFFSET"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Offset of start of magic field within header record "
    },
    {
      "type": "field",
      "varNames": [
        "MAGICLEN"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * The length of the magic field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "VERSION_OFFSET"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Offset of start of magic field within header record "
    },
    {
      "type": "field",
      "varNames": [
        "VERSIONLEN"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n     * Previously this was regarded as part of \"magic\" field, but it is separate.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MODTIMELEN"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n     * The length of the modification time field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UNAMELEN"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * The length of the user name field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "GNAMELEN"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * The length of the group name field in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEVLEN"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": "\n     * The length of each of the device fields (major and minor) in a header buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PREFIXLEN"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * Length of the prefix field.\n     * \n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_OLDNORM"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": "\n     * LF_ constants represent the \"link flag\" of an entry, or more commonly,\n     * the \"entry type\". This is the \"old way\" of indicating a normal file.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_NORMAL"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": "\n     * Normal file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_LINK"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": "\n     * Link file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_SYMLINK"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": "\n     * Symbolic link file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_CHR"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": "\n     * Character device file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_BLK"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": "\n     * Block device file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_DIR"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": "\n     * Directory file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_FIFO"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": "\n     * FIFO (pipe) file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_CONTIG"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": "\n     * Contiguous file type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_GNUTYPE_LONGNAME"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": "\n     * Identifies the *next* file on the tape as having a long name.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_PAX_EXTENDED_HEADER_LC"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": "\n     * Identifies the entry as a Pax extended header.\n     * @since Apache Commons Compress 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_PAX_EXTENDED_HEADER_UC"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": "\n     * Identifies the entry as a Pax extended header (SunOS tar -E).\n     *\n     * @since Apache Commons Compress 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LF_PAX_GLOBAL_EXTENDED_HEADER"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": "\n     * Identifies the entry as a Pax global extended header.\n     *\n     * @since Apache Commons Compress 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_POSIX"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": "\n     * The magic tag representing a POSIX tar archive.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "VERSION_POSIX"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_GNU"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": "\n     * The magic tag representing a GNU tar archive.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "VERSION_GNU_SPACE"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": " Appear to be two possible GNU versions"
    },
    {
      "type": "field",
      "varNames": [
        "VERSION_GNU_ZERO"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_ANT"
      ],
      "begin_line": 196,
      "end_line": 196,
      "comment": "\n     * The magic tag representing an Ant tar archive.\n     *\n     * @since Apache Commons Compress 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "VERSION_ANT"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": " so assume the version is 2 nulls"
    },
    {
      "type": "field",
      "varNames": [
        "GNU_LONGLINK"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": " TODO rename as LONGLINK_GNU ?"
    }
  ]
}