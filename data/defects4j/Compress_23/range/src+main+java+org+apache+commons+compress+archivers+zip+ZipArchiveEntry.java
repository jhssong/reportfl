{
  "filepath": "/tmp/Compress-23b/src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipArchiveEntry",
      "is_interface": false,
      "parent_types": [
        "java.util.zip.ZipEntry",
        "org.apache.commons.compress.archivers.ArchiveEntry"
      ],
      "begin_line": 51,
      "end_line": 701,
      "comment": "\n * Extension that adds better handling of extra fields and provides\n * access to the internal and external file attributes.\n *\n * \u003cp\u003eThe extra data is expected to follow the recommendation of\n * \u003ca href\u003d\"http://www.pkware.com/documents/casestudies/APPNOTE.TXT\"\u003eAPPNOTE.TXT\u003c/a\u003e:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003ethe extra byte array consists of a sequence of extra fields\u003c/li\u003e\n *   \u003cli\u003eeach extra fields starts by a two byte header id followed by\n *   a two byte sequence holding the length of the remainder of\n *   data.\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cp\u003eAny extra data that cannot be parsed by the rules above will be\n * consumed as \"unparseable\" extra data and treated differently by the\n * methods of this class.  Versions prior to Apache Commons Compress\n * 1.1 would have thrown an exception if any attempt was made to read\n * or write extra data not conforming to the recommendation.\u003c/p\u003e\n *\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "PLATFORM_UNIX"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PLATFORM_FAT"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SHORT_MASK"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SHORT_SHIFT"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "method"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * The {@link java.util.zip.ZipEntry} base class only supports\n     * the compression methods STORED and DEFLATED. We override the\n     * field so that any compression methods can be used.\n     * \u003cp\u003e\n     * The default value -1 means that the method has not been specified.\n     *\n     * @see \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-93\"\n     *        \u003eCOMPRESS-93\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * The {@link java.util.zip.ZipEntry#setSize} method in the base\n     * class throws an IllegalArgumentException if the size is bigger\n     * than 2GB for Java versions \u003c 7.  Need to keep our own size\n     * information for Zip64 support.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "internalAttributes"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "platform"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "externalAttributes"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "extraFields"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "unparseableExtra"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rawName"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "gpb"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry(java.lang.String)",
      "begin_line": 97,
      "end_line": 100,
      "comment": "\n     * Creates a new zip entry with the specified name.\n     *\n     * \u003cp\u003eAssumes the entry represents a directory if and only if the\n     * name ends with a forward slash \"/\".\u003c/p\u003e\n     *\n     * @param name the name of the entry\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 20)",
        "(line 99,col 9)-(line 99,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry(java.util.zip.ZipEntry)",
      "begin_line": 111,
      "end_line": 125,
      "comment": "\n     * Creates a new zip entry with fields taken from the specified zip entry.\n     *\n     * \u003cp\u003eAssumes the entry represents a directory if and only if the\n     * name ends with a forward slash \"/\".\u003c/p\u003e\n     *\n     * @param entry the entry to get fields from\n     * @throws ZipException on error\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 21)",
        "(line 113,col 9)-(line 113,col 33)",
        "(line 114,col 9)-(line 114,col 40)",
        "(line 115,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 37)",
        "(line 124,col 9)-(line 124,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 136,
      "end_line": 141,
      "comment": "\n     * Creates a new zip entry with fields taken from the specified zip entry.\n     *\n     * \u003cp\u003eAssumes the entry represents a directory if and only if the\n     * name ends with a forward slash \"/\".\u003c/p\u003e\n     *\n     * @param entry the entry to get fields from\n     * @throws ZipException on error\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 45)",
        "(line 138,col 9)-(line 138,col 61)",
        "(line 139,col 9)-(line 139,col 61)",
        "(line 140,col 9)-(line 140,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 158,
      "end_line": 166,
      "comment": "\n     * Creates a new zip entry taking some information from the given\n     * file and using the provided name.\n     *\n     * \u003cp\u003eThe name will be adjusted to end with a forward slash \"/\" if\n     * the file is a directory.  If the file is not a directory a\n     * potential trailing forward slash will be stripped from the\n     * entry name.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 160,col 42)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.clone()",
      "begin_line": 172,
      "end_line": 180,
      "comment": "\n     * Overwrite clone.\n     * @return a cloned copy of this ZipArchiveEntry\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 60)",
        "(line 176,col 9)-(line 176,col 57)",
        "(line 177,col 9)-(line 177,col 57)",
        "(line 178,col 9)-(line 178,col 47)",
        "(line 179,col 9)-(line 179,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getMethod()",
      "begin_line": 190,
      "end_line": 193,
      "comment": "\n     * Returns the compression method of this entry, or -1 if the\n     * compression method has not been specified.\n     *\n     * @return compression method\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setMethod(int)",
      "begin_line": 202,
      "end_line": 209,
      "comment": "\n     * Sets the compression method of this entry.\n     *\n     * @param method compression method\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 208,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getInternalAttributes()",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\n     * Retrieves the internal file attributes.\n     *\n     * @return the internal file attributes\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setInternalAttributes(int)",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n     * Sets the internal file attributes.\n     * @param value an \u003ccode\u003eint\u003c/code\u003e value\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getExternalAttributes()",
      "begin_line": 232,
      "end_line": 234,
      "comment": "\n     * Retrieves the external file attributes.\n     * @return the external file attributes\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setExternalAttributes(long)",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n     * Sets the external file attributes.\n     * @param value an \u003ccode\u003elong\u003c/code\u003e value\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setUnixMode(int)",
      "begin_line": 249,
      "end_line": 258,
      "comment": "\n     * Sets Unix permissions in a way that is understood by Info-Zip\u0027s\n     * unzip command.\n     * @param mode an \u003ccode\u003eint\u003c/code\u003e value\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 255,col 60)",
        "(line 257,col 9)-(line 257,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getUnixMode()",
      "begin_line": 264,
      "end_line": 267,
      "comment": "\n     * Unix permission.\n     * @return the unix permissions\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 266,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.isUnixSymlink()",
      "begin_line": 277,
      "end_line": 279,
      "comment": "\n     * Returns true if this entry represents a unix symlink,\n     * in which case the entry\u0027s content contains the target path\n     * for the symlink.\n     *\n     * @since 1.5\n     * @return true if the entry represents a unix symlink, false otherwise.\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getPlatform()",
      "begin_line": 288,
      "end_line": 290,
      "comment": "\n     * Platform specification to put into the \u0026quot;version made\n     * by\u0026quot; part of the central file header.\n     *\n     * @return PLATFORM_FAT unless {@link #setUnixMode setUnixMode}\n     * has been called, in which case PLATFORM_UNIX will be returned.\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setPlatform(int)",
      "begin_line": 296,
      "end_line": 298,
      "comment": "\n     * Set the platform (UNIX or FAT).\n     * @param platform an \u003ccode\u003eint\u003c/code\u003e value - 0 is FAT, 3 is UNIX\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setExtraFields(org.apache.commons.compress.archivers.zip.ZipExtraField[])",
      "begin_line": 304,
      "end_line": 314,
      "comment": "\n     * Replaces all currently attached extra fields with the new array.\n     * @param fields an array of extra fields\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 67)",
        "(line 306,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 313,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getExtraFields()",
      "begin_line": 320,
      "end_line": 322,
      "comment": "\n     * Retrieves all extra fields that have been parsed successfully.\n     * @return an array of the extra fields\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getExtraFields(boolean)",
      "begin_line": 333,
      "end_line": 345,
      "comment": "\n     * Retrieves extra fields.\n     * @param includeUnparseable whether to also return unparseable\n     * extra fields as {@link UnparseableExtraFieldData} if such data\n     * exists.\n     * @return an array of the extra fields\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 340,col 63)",
        "(line 341,col 9)-(line 343,col 9)",
        "(line 344,col 9)-(line 344,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.addExtraField(org.apache.commons.compress.archivers.zip.ZipExtraField)",
      "begin_line": 355,
      "end_line": 365,
      "comment": "\n     * Adds an extra field - replacing an already present extra field\n     * of the same type.\n     *\n     * \u003cp\u003eIf no extra field of the same type exists, the field will be\n     * added as last field.\u003c/p\u003e\n     * @param ze an extra field\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 364,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.addAsFirstExtraField(org.apache.commons.compress.archivers.zip.ZipExtraField)",
      "begin_line": 374,
      "end_line": 387,
      "comment": "\n     * Adds an extra field - replacing an already present extra field\n     * of the same type.\n     *\n     * \u003cp\u003eThe new extra field will be the first one.\u003c/p\u003e\n     * @param ze an extra field\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 386,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.removeExtraField(org.apache.commons.compress.archivers.zip.ZipShort)",
      "begin_line": 393,
      "end_line": 401,
      "comment": "\n     * Remove an extra field.\n     * @param type the type of extra field to remove\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 396,col 9)",
        "(line 397,col 9)-(line 399,col 9)",
        "(line 400,col 9)-(line 400,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.removeUnparseableExtraFieldData()",
      "begin_line": 408,
      "end_line": 414,
      "comment": "\n     * Removes unparseable extra field data.\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 412,col 32)",
        "(line 413,col 9)-(line 413,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getExtraField(org.apache.commons.compress.archivers.zip.ZipShort)",
      "begin_line": 421,
      "end_line": 426,
      "comment": "\n     * Looks up an extra field by its header id.\n     *\n     * @return null if no such field exists.\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 425,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getUnparseableExtraFieldData()",
      "begin_line": 435,
      "end_line": 437,
      "comment": "\n     * Looks up extra field data that couldn\u0027t be parsed correctly.\n     *\n     * @return null if no such field exists.\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setExtra(byte[])",
      "begin_line": 447,
      "end_line": 459,
      "comment": "\n     * Parses the given bytes as extra field data and consumes any\n     * unparseable data as an {@link UnparseableExtraFieldData}\n     * instance.\n     * @param extra an array of bytes to be parsed into extra fields\n     * @throws RuntimeException if the bytes cannot be parsed\n     * @throws RuntimeException on error\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 458,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setExtra()",
      "begin_line": 467,
      "end_line": 469,
      "comment": "\n     * Unfortunately {@link java.util.zip.ZipOutputStream\n     * java.util.zip.ZipOutputStream} seems to access the extra data\n     * directly, so overriding getExtra doesn\u0027t help - we need to\n     * modify super\u0027s data directly.\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setCentralDirectoryExtra(byte[])",
      "begin_line": 474,
      "end_line": 483,
      "comment": "\n     * Sets the central directory part of extra fields.\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 482,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getLocalFileDataExtra()",
      "begin_line": 489,
      "end_line": 492,
      "comment": "\n     * Retrieves the extra data for the local file data.\n     * @return the extra data for local file\n     ",
      "child_ranges": [
        "(line 490,col 9)-(line 490,col 34)",
        "(line 491,col 9)-(line 491,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getCentralDirectoryExtra()",
      "begin_line": 498,
      "end_line": 500,
      "comment": "\n     * Retrieves the extra data for the central directory.\n     * @return the central directory extra data\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getName()",
      "begin_line": 506,
      "end_line": 509,
      "comment": "\n     * Get the name of the entry.\n     * @return the entry name\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.isDirectory()",
      "begin_line": 515,
      "end_line": 518,
      "comment": "\n     * Is this entry a directory?\n     * @return true if the entry is a directory\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setName(java.lang.String)",
      "begin_line": 524,
      "end_line": 530,
      "comment": "\n     * Set the name of the entry.\n     * @param name the name to use\n     ",
      "child_ranges": [
        "(line 525,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 529,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getSize()",
      "begin_line": 536,
      "end_line": 539,
      "comment": "\n     * Gets the uncompressed size of the entry data.\n     * @return the entry size\n     ",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setSize(long)",
      "begin_line": 547,
      "end_line": 553,
      "comment": "\n     * Sets the uncompressed size of the entry data.\n     * @param size the uncompressed size in bytes\n     * @exception IllegalArgumentException if the specified size is less\n     *            than 0\n     ",
      "child_ranges": [
        "(line 549,col 9)-(line 551,col 9)",
        "(line 552,col 9)-(line 552,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setName(java.lang.String, byte[])",
      "begin_line": 564,
      "end_line": 567,
      "comment": "\n     * Sets the name using the raw bytes and the string created from\n     * it by guessing or using the configured encoding.\n     * @param name the name to use created from the raw bytes using\n     * the guessed or configured encoding\n     * @param rawName the bytes originally read as name from the\n     * archive\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 22)",
        "(line 566,col 9)-(line 566,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getRawName()",
      "begin_line": 578,
      "end_line": 585,
      "comment": "\n     * Returns the raw bytes that made up the name before it has been\n     * converted using the configured or guessed encoding.\n     *\n     * \u003cp\u003eThis method will return null if this instance has not been\n     * read from an archive.\u003c/p\u003e\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 579,col 9)-(line 583,col 9)",
        "(line 584,col 9)-(line 584,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.hashCode()",
      "begin_line": 592,
      "end_line": 599,
      "comment": "\n     * Get the hashCode of the entry.\n     * This uses the name as the hashcode.\n     * @return a hashcode.\n     ",
      "child_ranges": [
        "(line 598,col 9)-(line 598,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getGeneralPurposeBit()",
      "begin_line": 605,
      "end_line": 607,
      "comment": "\n     * The \"general purpose bit\" field.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 606,col 9)-(line 606,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setGeneralPurposeBit(org.apache.commons.compress.archivers.zip.GeneralPurposeBit)",
      "begin_line": 613,
      "end_line": 615,
      "comment": "\n     * The \"general purpose bit\" field.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 614,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.mergeExtraFields(org.apache.commons.compress.archivers.zip.ZipExtraField[], boolean)",
      "begin_line": 625,
      "end_line": 651,
      "comment": "\n     * If there are no extra fields, use the given fields as new extra\n     * data - otherwise merge the fields assuming the existing fields\n     * and the new fields stem from different locations inside the\n     * archive.\n     * @param f the extra fields to merge\n     * @param local whether the new fields originate from local data\n     ",
      "child_ranges": [
        "(line 627,col 9)-(line 650,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getLastModifiedDate()",
      "begin_line": 653,
      "end_line": 655,
      "comment": "",
      "child_ranges": [
        "(line 654,col 9)-(line 654,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.equals(java.lang.Object)",
      "begin_line": 660,
      "end_line": 700,
      "comment": " (non-Javadoc)\n     * @see java.lang.Object#equals(java.lang.Object)\n     ",
      "child_ranges": [
        "(line 662,col 9)-(line 664,col 9)",
        "(line 665,col 9)-(line 667,col 9)",
        "(line 668,col 9)-(line 668,col 54)",
        "(line 669,col 9)-(line 669,col 34)",
        "(line 670,col 9)-(line 670,col 43)",
        "(line 671,col 9)-(line 677,col 9)",
        "(line 678,col 9)-(line 678,col 40)",
        "(line 679,col 9)-(line 679,col 49)",
        "(line 680,col 9)-(line 682,col 9)",
        "(line 683,col 9)-(line 685,col 9)",
        "(line 686,col 9)-(line 699,col 37)"
      ]
    }
  ]
}