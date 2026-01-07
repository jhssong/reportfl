{
  "filepath": "/tmp/Compress-34b/src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipArchiveEntry",
      "is_interface": false,
      "parent_types": [
        "java.util.zip.ZipEntry",
        "org.apache.commons.compress.archivers.ArchiveEntry"
      ],
      "begin_line": 50,
      "end_line": 794,
      "comment": "\n * Extension that adds better handling of extra fields and provides\n * access to the internal and external file attributes.\n *\n * \u003cp\u003eThe extra data is expected to follow the recommendation of\n * \u003ca href\u003d\"http://www.pkware.com/documents/casestudies/APPNOTE.TXT\"\u003eAPPNOTE.TXT\u003c/a\u003e:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003ethe extra byte array consists of a sequence of extra fields\u003c/li\u003e\n *   \u003cli\u003eeach extra fields starts by a two byte header id followed by\n *   a two byte sequence holding the length of the remainder of\n *   data.\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cp\u003eAny extra data that cannot be parsed by the rules above will be\n * consumed as \"unparseable\" extra data and treated differently by the\n * methods of this class.  Versions prior to Apache Commons Compress\n * 1.1 would have thrown an exception if any attempt was made to read\n * or write extra data not conforming to the recommendation.\u003c/p\u003e\n *\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "PLATFORM_UNIX"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PLATFORM_FAT"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CRC_UNKNOWN"
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
      "type": "field",
      "varNames": [
        "noExtraFields"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry(java.lang.String)",
      "begin_line": 98,
      "end_line": 101,
      "comment": "\n     * Creates a new zip entry with the specified name.\n     *\n     * \u003cp\u003eAssumes the entry represents a directory if and only if the\n     * name ends with a forward slash \"/\".\u003c/p\u003e\n     *\n     * @param name the name of the entry\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 20)",
        "(line 100,col 9)-(line 100,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry(java.util.zip.ZipEntry)",
      "begin_line": 112,
      "end_line": 126,
      "comment": "\n     * Creates a new zip entry with fields taken from the specified zip entry.\n     *\n     * \u003cp\u003eAssumes the entry represents a directory if and only if the\n     * name ends with a forward slash \"/\".\u003c/p\u003e\n     *\n     * @param entry the entry to get fields from\n     * @throws ZipException on error\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 21)",
        "(line 114,col 9)-(line 114,col 33)",
        "(line 115,col 9)-(line 115,col 40)",
        "(line 116,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 37)",
        "(line 125,col 9)-(line 125,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 137,
      "end_line": 146,
      "comment": "\n     * Creates a new zip entry with fields taken from the specified zip entry.\n     *\n     * \u003cp\u003eAssumes the entry represents a directory if and only if the\n     * name ends with a forward slash \"/\".\u003c/p\u003e\n     *\n     * @param entry the entry to get fields from\n     * @throws ZipException on error\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 45)",
        "(line 139,col 9)-(line 139,col 61)",
        "(line 140,col 9)-(line 140,col 61)",
        "(line 141,col 9)-(line 141,col 50)",
        "(line 142,col 9)-(line 142,col 41)",
        "(line 143,col 9)-(line 143,col 63)",
        "(line 144,col 9)-(line 145,col 64)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 165,
      "end_line": 173,
      "comment": "\n     * Creates a new zip entry taking some information from the given\n     * file and using the provided name.\n     *\n     * \u003cp\u003eThe name will be adjusted to end with a forward slash \"/\" if\n     * the file is a directory.  If the file is not a directory a\n     * potential trailing forward slash will be stripped from the\n     * entry name.\u003c/p\u003e\n     * @param inputFile file to create the entry from\n     * @param entryName name of the entry\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 167,col 42)",
        "(line 168,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.clone()",
      "begin_line": 179,
      "end_line": 187,
      "comment": "\n     * Overwrite clone.\n     * @return a cloned copy of this ZipArchiveEntry\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 60)",
        "(line 183,col 9)-(line 183,col 57)",
        "(line 184,col 9)-(line 184,col 57)",
        "(line 185,col 9)-(line 185,col 52)",
        "(line 186,col 9)-(line 186,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getMethod()",
      "begin_line": 197,
      "end_line": 200,
      "comment": "\n     * Returns the compression method of this entry, or -1 if the\n     * compression method has not been specified.\n     *\n     * @return compression method\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setMethod(int)",
      "begin_line": 209,
      "end_line": 216,
      "comment": "\n     * Sets the compression method of this entry.\n     *\n     * @param method compression method\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getInternalAttributes()",
      "begin_line": 227,
      "end_line": 229,
      "comment": "\n     * Retrieves the internal file attributes.\n     *\n     * \u003cp\u003e\u003cb\u003eNote\u003c/b\u003e: {@link ZipArchiveInputStream} is unable to fill\n     * this field, you must use {@link ZipFile} if you want to read\n     * entries using this attribute.\u003c/p\u003e\n     *\n     * @return the internal file attributes\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setInternalAttributes(int)",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\n     * Sets the internal file attributes.\n     * @param value an \u003ccode\u003eint\u003c/code\u003e value\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getExternalAttributes()",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\n     * Retrieves the external file attributes.\n     *\n     * \u003cp\u003e\u003cb\u003eNote\u003c/b\u003e: {@link ZipArchiveInputStream} is unable to fill\n     * this field, you must use {@link ZipFile} if you want to read\n     * entries using this attribute.\u003c/p\u003e\n     *\n     * @return the external file attributes\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setExternalAttributes(long)",
      "begin_line": 256,
      "end_line": 258,
      "comment": "\n     * Sets the external file attributes.\n     * @param value an \u003ccode\u003elong\u003c/code\u003e value\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setUnixMode(int)",
      "begin_line": 265,
      "end_line": 274,
      "comment": "\n     * Sets Unix permissions in a way that is understood by Info-Zip\u0027s\n     * unzip command.\n     * @param mode an \u003ccode\u003eint\u003c/code\u003e value\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 271,col 60)",
        "(line 273,col 9)-(line 273,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getUnixMode()",
      "begin_line": 280,
      "end_line": 283,
      "comment": "\n     * Unix permission.\n     * @return the unix permissions\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 282,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.isUnixSymlink()",
      "begin_line": 293,
      "end_line": 295,
      "comment": "\n     * Returns true if this entry represents a unix symlink,\n     * in which case the entry\u0027s content contains the target path\n     * for the symlink.\n     *\n     * @since 1.5\n     * @return true if the entry represents a unix symlink, false otherwise.\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getPlatform()",
      "begin_line": 304,
      "end_line": 306,
      "comment": "\n     * Platform specification to put into the \u0026quot;version made\n     * by\u0026quot; part of the central file header.\n     *\n     * @return PLATFORM_FAT unless {@link #setUnixMode setUnixMode}\n     * has been called, in which case PLATFORM_UNIX will be returned.\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setPlatform(int)",
      "begin_line": 312,
      "end_line": 314,
      "comment": "\n     * Set the platform (UNIX or FAT).\n     * @param platform an \u003ccode\u003eint\u003c/code\u003e value - 0 is FAT, 3 is UNIX\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setExtraFields(org.apache.commons.compress.archivers.zip.ZipExtraField[])",
      "begin_line": 320,
      "end_line": 331,
      "comment": "\n     * Replaces all currently attached extra fields with the new array.\n     * @param fields an array of extra fields\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 71)",
        "(line 322,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 329,col 77)",
        "(line 330,col 9)-(line 330,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getExtraFields()",
      "begin_line": 343,
      "end_line": 345,
      "comment": "\n     * Retrieves all extra fields that have been parsed successfully.\n     *\n     * \u003cp\u003e\u003cb\u003eNote\u003c/b\u003e: The set of extra fields may be incomplete when\n     * {@link ZipArchiveInputStream} has been used as some extra\n     * fields use the central directory to store additional\n     * information.\u003c/p\u003e\n     *\n     * @return an array of the extra fields\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getExtraFields(boolean)",
      "begin_line": 356,
      "end_line": 360,
      "comment": "\n     * Retrieves extra fields.\n     * @param includeUnparseable whether to also return unparseable\n     * extra fields as {@link UnparseableExtraFieldData} if such data\n     * exists.\n     * @return an array of the extra fields\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 359,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getParseableExtraFieldsNoCopy()",
      "begin_line": 362,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 363,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 366,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getParseableExtraFields()",
      "begin_line": 369,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 85)",
        "(line 371,col 9)-(line 371,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getAllExtraFieldsNoCopy()",
      "begin_line": 378,
      "end_line": 383,
      "comment": "\n     * Get all extra fields, including unparseable ones.\n     * @return An array of all extra fields. Not necessarily a copy of internal data structures, hence private method\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 382,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.copyOf(org.apache.commons.compress.archivers.zip.ZipExtraField[])",
      "begin_line": 385,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.copyOf(org.apache.commons.compress.archivers.zip.ZipExtraField[], int)",
      "begin_line": 389,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 56)",
        "(line 391,col 9)-(line 391,col 71)",
        "(line 392,col 9)-(line 392,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getMergedFields()",
      "begin_line": 395,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 91)",
        "(line 397,col 9)-(line 397,col 62)",
        "(line 398,col 9)-(line 398,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getUnparseableOnly()",
      "begin_line": 401,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getAllExtraFields()",
      "begin_line": 405,
      "end_line": 408,
      "comment": "",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 79)",
        "(line 407,col 9)-(line 407,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.addExtraField(org.apache.commons.compress.archivers.zip.ZipExtraField)",
      "begin_line": 417,
      "end_line": 433,
      "comment": "\n     * Adds an extra field - replacing an already present extra field\n     * of the same type.\n     *\n     * \u003cp\u003eIf no extra field of the same type exists, the field will be\n     * added as last field.\u003c/p\u003e\n     * @param ze an extra field\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 432,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.addAsFirstExtraField(org.apache.commons.compress.archivers.zip.ZipExtraField)",
      "begin_line": 442,
      "end_line": 458,
      "comment": "\n     * Adds an extra field - replacing an already present extra field\n     * of the same type.\n     *\n     * \u003cp\u003eThe new extra field will be the first one.\u003c/p\u003e\n     * @param ze an extra field\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 456,col 9)",
        "(line 457,col 9)-(line 457,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.removeExtraField(org.apache.commons.compress.archivers.zip.ZipShort)",
      "begin_line": 464,
      "end_line": 480,
      "comment": "\n     * Remove an extra field.\n     * @param type the type of extra field to remove\n     ",
      "child_ranges": [
        "(line 465,col 9)-(line 467,col 9)",
        "(line 469,col 9)-(line 469,col 71)",
        "(line 470,col 9)-(line 474,col 9)",
        "(line 475,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 478,col 77)",
        "(line 479,col 9)-(line 479,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.removeUnparseableExtraFieldData()",
      "begin_line": 487,
      "end_line": 493,
      "comment": "\n     * Removes unparseable extra field data.\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 490,col 9)",
        "(line 491,col 9)-(line 491,col 32)",
        "(line 492,col 9)-(line 492,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getExtraField(org.apache.commons.compress.archivers.zip.ZipShort)",
      "begin_line": 501,
      "end_line": 510,
      "comment": "\n     * Looks up an extra field by its header id.\n     *\n     * @param type the header id\n     * @return null if no such field exists.\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 508,col 9)",
        "(line 509,col 9)-(line 509,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getUnparseableExtraFieldData()",
      "begin_line": 519,
      "end_line": 521,
      "comment": "\n     * Looks up extra field data that couldn\u0027t be parsed correctly.\n     *\n     * @return null if no such field exists.\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setExtra(byte[])",
      "begin_line": 531,
      "end_line": 543,
      "comment": "\n     * Parses the given bytes as extra field data and consumes any\n     * unparseable data as an {@link UnparseableExtraFieldData}\n     * instance.\n     * @param extra an array of bytes to be parsed into extra fields\n     * @throws RuntimeException if the bytes cannot be parsed\n     * @throws RuntimeException on error\n     ",
      "child_ranges": [
        "(line 533,col 9)-(line 542,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setExtra()",
      "begin_line": 551,
      "end_line": 553,
      "comment": "\n     * Unfortunately {@link java.util.zip.ZipOutputStream\n     * java.util.zip.ZipOutputStream} seems to access the extra data\n     * directly, so overriding getExtra doesn\u0027t help - we need to\n     * modify super\u0027s data directly.\n     ",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setCentralDirectoryExtra(byte[])",
      "begin_line": 559,
      "end_line": 568,
      "comment": "\n     * Sets the central directory part of extra fields.\n     * @param b an array of bytes to be parsed into extra fields\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 567,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getLocalFileDataExtra()",
      "begin_line": 574,
      "end_line": 577,
      "comment": "\n     * Retrieves the extra data for the local file data.\n     * @return the extra data for local file\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 34)",
        "(line 576,col 9)-(line 576,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getCentralDirectoryExtra()",
      "begin_line": 583,
      "end_line": 585,
      "comment": "\n     * Retrieves the extra data for the central directory.\n     * @return the central directory extra data\n     ",
      "child_ranges": [
        "(line 584,col 9)-(line 584,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getName()",
      "begin_line": 591,
      "end_line": 594,
      "comment": "\n     * Get the name of the entry.\n     * @return the entry name\n     ",
      "child_ranges": [
        "(line 593,col 9)-(line 593,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.isDirectory()",
      "begin_line": 600,
      "end_line": 603,
      "comment": "\n     * Is this entry a directory?\n     * @return true if the entry is a directory\n     ",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setName(java.lang.String)",
      "begin_line": 609,
      "end_line": 615,
      "comment": "\n     * Set the name of the entry.\n     * @param name the name to use\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 613,col 9)",
        "(line 614,col 9)-(line 614,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getSize()",
      "begin_line": 626,
      "end_line": 629,
      "comment": "\n     * Gets the uncompressed size of the entry data.\n     *\n     * \u003cp\u003e\u003cb\u003eNote\u003c/b\u003e: {@link ZipArchiveInputStream} may create\n     * entries that return {@link #SIZE_UNKNOWN SIZE_UNKNOWN} as long\n     * as the entry hasn\u0027t been read completely.\u003c/p\u003e\n     *\n     * @return the entry size\n     ",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setSize(long)",
      "begin_line": 637,
      "end_line": 643,
      "comment": "\n     * Sets the uncompressed size of the entry data.\n     * @param size the uncompressed size in bytes\n     * @exception IllegalArgumentException if the specified size is less\n     *            than 0\n     ",
      "child_ranges": [
        "(line 639,col 9)-(line 641,col 9)",
        "(line 642,col 9)-(line 642,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setName(java.lang.String, byte[])",
      "begin_line": 654,
      "end_line": 657,
      "comment": "\n     * Sets the name using the raw bytes and the string created from\n     * it by guessing or using the configured encoding.\n     * @param name the name to use created from the raw bytes using\n     * the guessed or configured encoding\n     * @param rawName the bytes originally read as name from the\n     * archive\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 655,col 9)-(line 655,col 22)",
        "(line 656,col 9)-(line 656,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getRawName()",
      "begin_line": 669,
      "end_line": 676,
      "comment": "\n     * Returns the raw bytes that made up the name before it has been\n     * converted using the configured or guessed encoding.\n     *\n     * \u003cp\u003eThis method will return null if this instance has not been\n     * read from an archive.\u003c/p\u003e\n     *\n     * @return the raw name bytes\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 670,col 9)-(line 674,col 9)",
        "(line 675,col 9)-(line 675,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.hashCode()",
      "begin_line": 683,
      "end_line": 690,
      "comment": "\n     * Get the hashCode of the entry.\n     * This uses the name as the hashcode.\n     * @return a hashcode.\n     ",
      "child_ranges": [
        "(line 689,col 9)-(line 689,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getGeneralPurposeBit()",
      "begin_line": 697,
      "end_line": 699,
      "comment": "\n     * The \"general purpose bit\" field.\n     * @return the general purpose bit\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 698,col 9)-(line 698,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setGeneralPurposeBit(org.apache.commons.compress.archivers.zip.GeneralPurposeBit)",
      "begin_line": 706,
      "end_line": 708,
      "comment": "\n     * The \"general purpose bit\" field.\n     * @param b the general purpose bit\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 707,col 9)-(line 707,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.mergeExtraFields(org.apache.commons.compress.archivers.zip.ZipExtraField[], boolean)",
      "begin_line": 718,
      "end_line": 744,
      "comment": "\n     * If there are no extra fields, use the given fields as new extra\n     * data - otherwise merge the fields assuming the existing fields\n     * and the new fields stem from different locations inside the\n     * archive.\n     * @param f the extra fields to merge\n     * @param local whether the new fields originate from local data\n     ",
      "child_ranges": [
        "(line 720,col 9)-(line 743,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getLastModifiedDate()",
      "begin_line": 746,
      "end_line": 748,
      "comment": "",
      "child_ranges": [
        "(line 747,col 9)-(line 747,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.equals(java.lang.Object)",
      "begin_line": 753,
      "end_line": 793,
      "comment": " (non-Javadoc)\n     * @see java.lang.Object#equals(java.lang.Object)\n     ",
      "child_ranges": [
        "(line 755,col 9)-(line 757,col 9)",
        "(line 758,col 9)-(line 760,col 9)",
        "(line 761,col 9)-(line 761,col 54)",
        "(line 762,col 9)-(line 762,col 34)",
        "(line 763,col 9)-(line 763,col 43)",
        "(line 764,col 9)-(line 770,col 9)",
        "(line 771,col 9)-(line 771,col 40)",
        "(line 772,col 9)-(line 772,col 49)",
        "(line 773,col 9)-(line 775,col 9)",
        "(line 776,col 9)-(line 778,col 9)",
        "(line 779,col 9)-(line 792,col 37)"
      ]
    }
  ]
}