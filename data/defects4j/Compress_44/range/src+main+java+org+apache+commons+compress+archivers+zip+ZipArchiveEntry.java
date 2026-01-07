{
  "filepath": "/tmp/Compress-44b/src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipArchiveEntry",
      "is_interface": false,
      "parent_types": [
        "java.util.zip.ZipEntry",
        "org.apache.commons.compress.archivers.ArchiveEntry",
        "org.apache.commons.compress.archivers.EntryStreamOffsets"
      ],
      "begin_line": 51,
      "end_line": 927,
      "comment": "\n * Extension that adds better handling of extra fields and provides\n * access to the internal and external file attributes.\n *\n * \u003cp\u003eThe extra data is expected to follow the recommendation of\n * \u003ca href\u003d\"http://www.pkware.com/documents/casestudies/APPNOTE.TXT\"\u003eAPPNOTE.TXT\u003c/a\u003e:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003ethe extra byte array consists of a sequence of extra fields\u003c/li\u003e\n *   \u003cli\u003eeach extra fields starts by a two byte header id followed by\n *   a two byte sequence holding the length of the remainder of\n *   data.\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cp\u003eAny extra data that cannot be parsed by the rules above will be\n * consumed as \"unparseable\" extra data and treated differently by the\n * methods of this class.  Versions prior to Apache Commons Compress\n * 1.1 would have thrown an exception if any attempt was made to read\n * or write extra data not conforming to the recommendation.\u003c/p\u003e\n *\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "PLATFORM_UNIX"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PLATFORM_FAT"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CRC_UNKNOWN"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SHORT_MASK"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SHORT_SHIFT"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "method"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * The {@link java.util.zip.ZipEntry} base class only supports\n     * the compression methods STORED and DEFLATED. We override the\n     * field so that any compression methods can be used.\n     * \u003cp\u003e\n     * The default value -1 means that the method has not been specified.\n     *\n     * @see \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-93\"\n     *        \u003eCOMPRESS-93\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * The {@link java.util.zip.ZipEntry#setSize} method in the base\n     * class throws an IllegalArgumentException if the size is bigger\n     * than 2GB for Java versions \u003c 7.  Need to keep our own size\n     * information for Zip64 support.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "internalAttributes"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "versionRequired"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "versionMadeBy"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "platform"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rawFlag"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "externalAttributes"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "alignment"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "extraFields"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "unparseableExtra"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rawName"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "gpb"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "noExtraFields"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "localHeaderOffset"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dataOffset"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isStreamContiguous"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry(java.lang.String)",
      "begin_line": 108,
      "end_line": 111,
      "comment": "\n     * Creates a new zip entry with the specified name.\n     *\n     * \u003cp\u003eAssumes the entry represents a directory if and only if the\n     * name ends with a forward slash \"/\".\u003c/p\u003e\n     *\n     * @param name the name of the entry\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 20)",
        "(line 110,col 9)-(line 110,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry(java.util.zip.ZipEntry)",
      "begin_line": 122,
      "end_line": 136,
      "comment": "\n     * Creates a new zip entry with fields taken from the specified zip entry.\n     *\n     * \u003cp\u003eAssumes the entry represents a directory if and only if the\n     * name ends with a forward slash \"/\".\u003c/p\u003e\n     *\n     * @param entry the entry to get fields from\n     * @throws ZipException on error\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 21)",
        "(line 124,col 9)-(line 124,col 33)",
        "(line 125,col 9)-(line 125,col 46)",
        "(line 126,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 37)",
        "(line 135,col 9)-(line 135,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 147,
      "end_line": 156,
      "comment": "\n     * Creates a new zip entry with fields taken from the specified zip entry.\n     *\n     * \u003cp\u003eAssumes the entry represents a directory if and only if the\n     * name ends with a forward slash \"/\".\u003c/p\u003e\n     *\n     * @param entry the entry to get fields from\n     * @throws ZipException on error\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 45)",
        "(line 149,col 9)-(line 149,col 61)",
        "(line 150,col 9)-(line 150,col 61)",
        "(line 151,col 9)-(line 151,col 50)",
        "(line 152,col 9)-(line 152,col 41)",
        "(line 153,col 9)-(line 153,col 69)",
        "(line 154,col 9)-(line 155,col 64)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 175,
      "end_line": 183,
      "comment": "\n     * Creates a new zip entry taking some information from the given\n     * file and using the provided name.\n     *\n     * \u003cp\u003eThe name will be adjusted to end with a forward slash \"/\" if\n     * the file is a directory.  If the file is not a directory a\n     * potential trailing forward slash will be stripped from the\n     * entry name.\u003c/p\u003e\n     * @param inputFile file to create the entry from\n     * @param entryName name of the entry\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 177,col 42)",
        "(line 178,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.clone()",
      "begin_line": 189,
      "end_line": 197,
      "comment": "\n     * Overwrite clone.\n     * @return a cloned copy of this ZipArchiveEntry\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 66)",
        "(line 193,col 9)-(line 193,col 57)",
        "(line 194,col 9)-(line 194,col 57)",
        "(line 195,col 9)-(line 195,col 52)",
        "(line 196,col 9)-(line 196,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getMethod()",
      "begin_line": 207,
      "end_line": 210,
      "comment": "\n     * Returns the compression method of this entry, or -1 if the\n     * compression method has not been specified.\n     *\n     * @return compression method\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setMethod(int)",
      "begin_line": 219,
      "end_line": 226,
      "comment": "\n     * Sets the compression method of this entry.\n     *\n     * @param method compression method\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getInternalAttributes()",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\n     * Retrieves the internal file attributes.\n     *\n     * \u003cp\u003e\u003cb\u003eNote\u003c/b\u003e: {@link ZipArchiveInputStream} is unable to fill\n     * this field, you must use {@link ZipFile} if you want to read\n     * entries using this attribute.\u003c/p\u003e\n     *\n     * @return the internal file attributes\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setInternalAttributes(int)",
      "begin_line": 245,
      "end_line": 247,
      "comment": "\n     * Sets the internal file attributes.\n     * @param value an \u003ccode\u003eint\u003c/code\u003e value\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getExternalAttributes()",
      "begin_line": 258,
      "end_line": 260,
      "comment": "\n     * Retrieves the external file attributes.\n     *\n     * \u003cp\u003e\u003cb\u003eNote\u003c/b\u003e: {@link ZipArchiveInputStream} is unable to fill\n     * this field, you must use {@link ZipFile} if you want to read\n     * entries using this attribute.\u003c/p\u003e\n     *\n     * @return the external file attributes\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setExternalAttributes(long)",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\n     * Sets the external file attributes.\n     * @param value an \u003ccode\u003elong\u003c/code\u003e value\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setUnixMode(int)",
      "begin_line": 275,
      "end_line": 284,
      "comment": "\n     * Sets Unix permissions in a way that is understood by Info-Zip\u0027s\n     * unzip command.\n     * @param mode an \u003ccode\u003eint\u003c/code\u003e value\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 281,col 60)",
        "(line 283,col 9)-(line 283,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getUnixMode()",
      "begin_line": 290,
      "end_line": 293,
      "comment": "\n     * Unix permission.\n     * @return the unix permissions\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 292,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.isUnixSymlink()",
      "begin_line": 303,
      "end_line": 305,
      "comment": "\n     * Returns true if this entry represents a unix symlink,\n     * in which case the entry\u0027s content contains the target path\n     * for the symlink.\n     *\n     * @since 1.5\n     * @return true if the entry represents a unix symlink, false otherwise.\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getPlatform()",
      "begin_line": 314,
      "end_line": 316,
      "comment": "\n     * Platform specification to put into the \u0026quot;version made\n     * by\u0026quot; part of the central file header.\n     *\n     * @return PLATFORM_FAT unless {@link #setUnixMode setUnixMode}\n     * has been called, in which case PLATFORM_UNIX will be returned.\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setPlatform(int)",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\n     * Set the platform (UNIX or FAT).\n     * @param platform an \u003ccode\u003eint\u003c/code\u003e value - 0 is FAT, 3 is UNIX\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getAlignment()",
      "begin_line": 333,
      "end_line": 335,
      "comment": "\n     * Gets currently configured alignment.\n     *\n     * @return\n     *      alignment for this entry.\n     * @since 1.14\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setAlignment(int)",
      "begin_line": 344,
      "end_line": 350,
      "comment": "\n     * Sets alignment for this entry.\n     *\n     * @param alignment\n     *      requested alignment, 0 for default.\n     * @since 1.14\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 349,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setExtraFields(org.apache.commons.compress.archivers.zip.ZipExtraField[])",
      "begin_line": 356,
      "end_line": 367,
      "comment": "\n     * Replaces all currently attached extra fields with the new array.\n     * @param fields an array of extra fields\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 64)",
        "(line 358,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 365,col 77)",
        "(line 366,col 9)-(line 366,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getExtraFields()",
      "begin_line": 379,
      "end_line": 381,
      "comment": "\n     * Retrieves all extra fields that have been parsed successfully.\n     *\n     * \u003cp\u003e\u003cb\u003eNote\u003c/b\u003e: The set of extra fields may be incomplete when\n     * {@link ZipArchiveInputStream} has been used as some extra\n     * fields use the central directory to store additional\n     * information.\u003c/p\u003e\n     *\n     * @return an array of the extra fields\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getExtraFields(boolean)",
      "begin_line": 392,
      "end_line": 396,
      "comment": "\n     * Retrieves extra fields.\n     * @param includeUnparseable whether to also return unparseable\n     * extra fields as {@link UnparseableExtraFieldData} if such data\n     * exists.\n     * @return an array of the extra fields\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 395,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getParseableExtraFieldsNoCopy()",
      "begin_line": 398,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 399,col 9)-(line 401,col 9)",
        "(line 402,col 9)-(line 402,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getParseableExtraFields()",
      "begin_line": 405,
      "end_line": 408,
      "comment": "",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 85)",
        "(line 407,col 9)-(line 407,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getAllExtraFieldsNoCopy()",
      "begin_line": 414,
      "end_line": 419,
      "comment": "\n     * Get all extra fields, including unparseable ones.\n     * @return An array of all extra fields. Not necessarily a copy of internal data structures, hence private method\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 418,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.copyOf(org.apache.commons.compress.archivers.zip.ZipExtraField[])",
      "begin_line": 421,
      "end_line": 423,
      "comment": "",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.copyOf(org.apache.commons.compress.archivers.zip.ZipExtraField[], int)",
      "begin_line": 425,
      "end_line": 429,
      "comment": "",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 62)",
        "(line 427,col 9)-(line 427,col 71)",
        "(line 428,col 9)-(line 428,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getMergedFields()",
      "begin_line": 431,
      "end_line": 435,
      "comment": "",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 91)",
        "(line 433,col 9)-(line 433,col 62)",
        "(line 434,col 9)-(line 434,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getUnparseableOnly()",
      "begin_line": 437,
      "end_line": 439,
      "comment": "",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getAllExtraFields()",
      "begin_line": 441,
      "end_line": 444,
      "comment": "",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 79)",
        "(line 443,col 9)-(line 443,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.addExtraField(org.apache.commons.compress.archivers.zip.ZipExtraField)",
      "begin_line": 453,
      "end_line": 469,
      "comment": "\n     * Adds an extra field - replacing an already present extra field\n     * of the same type.\n     *\n     * \u003cp\u003eIf no extra field of the same type exists, the field will be\n     * added as last field.\u003c/p\u003e\n     * @param ze an extra field\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 467,col 9)",
        "(line 468,col 9)-(line 468,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.addAsFirstExtraField(org.apache.commons.compress.archivers.zip.ZipExtraField)",
      "begin_line": 478,
      "end_line": 494,
      "comment": "\n     * Adds an extra field - replacing an already present extra field\n     * of the same type.\n     *\n     * \u003cp\u003eThe new extra field will be the first one.\u003c/p\u003e\n     * @param ze an extra field\n     ",
      "child_ranges": [
        "(line 479,col 9)-(line 492,col 9)",
        "(line 493,col 9)-(line 493,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.removeExtraField(org.apache.commons.compress.archivers.zip.ZipShort)",
      "begin_line": 500,
      "end_line": 516,
      "comment": "\n     * Remove an extra field.\n     * @param type the type of extra field to remove\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 503,col 9)",
        "(line 505,col 9)-(line 505,col 64)",
        "(line 506,col 9)-(line 510,col 9)",
        "(line 511,col 9)-(line 513,col 9)",
        "(line 514,col 9)-(line 514,col 77)",
        "(line 515,col 9)-(line 515,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.removeUnparseableExtraFieldData()",
      "begin_line": 523,
      "end_line": 529,
      "comment": "\n     * Removes unparseable extra field data.\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 524,col 9)-(line 526,col 9)",
        "(line 527,col 9)-(line 527,col 32)",
        "(line 528,col 9)-(line 528,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getExtraField(org.apache.commons.compress.archivers.zip.ZipShort)",
      "begin_line": 537,
      "end_line": 546,
      "comment": "\n     * Looks up an extra field by its header id.\n     *\n     * @param type the header id\n     * @return null if no such field exists.\n     ",
      "child_ranges": [
        "(line 538,col 9)-(line 544,col 9)",
        "(line 545,col 9)-(line 545,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getUnparseableExtraFieldData()",
      "begin_line": 555,
      "end_line": 557,
      "comment": "\n     * Looks up extra field data that couldn\u0027t be parsed correctly.\n     *\n     * @return null if no such field exists.\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setExtra(byte[])",
      "begin_line": 567,
      "end_line": 579,
      "comment": "\n     * Parses the given bytes as extra field data and consumes any\n     * unparseable data as an {@link UnparseableExtraFieldData}\n     * instance.\n     * @param extra an array of bytes to be parsed into extra fields\n     * @throws RuntimeException if the bytes cannot be parsed\n     * @throws RuntimeException on error\n     ",
      "child_ranges": [
        "(line 569,col 9)-(line 578,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setExtra()",
      "begin_line": 587,
      "end_line": 589,
      "comment": "\n     * Unfortunately {@link java.util.zip.ZipOutputStream\n     * java.util.zip.ZipOutputStream} seems to access the extra data\n     * directly, so overriding getExtra doesn\u0027t help - we need to\n     * modify super\u0027s data directly.\n     ",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setCentralDirectoryExtra(byte[])",
      "begin_line": 595,
      "end_line": 604,
      "comment": "\n     * Sets the central directory part of extra fields.\n     * @param b an array of bytes to be parsed into extra fields\n     ",
      "child_ranges": [
        "(line 596,col 9)-(line 603,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getLocalFileDataExtra()",
      "begin_line": 610,
      "end_line": 613,
      "comment": "\n     * Retrieves the extra data for the local file data.\n     * @return the extra data for local file\n     ",
      "child_ranges": [
        "(line 611,col 9)-(line 611,col 40)",
        "(line 612,col 9)-(line 612,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getCentralDirectoryExtra()",
      "begin_line": 619,
      "end_line": 621,
      "comment": "\n     * Retrieves the extra data for the central directory.\n     * @return the central directory extra data\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 620,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getName()",
      "begin_line": 627,
      "end_line": 630,
      "comment": "\n     * Get the name of the entry.\n     * @return the entry name\n     ",
      "child_ranges": [
        "(line 629,col 9)-(line 629,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.isDirectory()",
      "begin_line": 636,
      "end_line": 639,
      "comment": "\n     * Is this entry a directory?\n     * @return true if the entry is a directory\n     ",
      "child_ranges": [
        "(line 638,col 9)-(line 638,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setName(java.lang.String)",
      "begin_line": 645,
      "end_line": 651,
      "comment": "\n     * Set the name of the entry.\n     * @param name the name to use\n     ",
      "child_ranges": [
        "(line 646,col 9)-(line 649,col 9)",
        "(line 650,col 9)-(line 650,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getSize()",
      "begin_line": 662,
      "end_line": 665,
      "comment": "\n     * Gets the uncompressed size of the entry data.\n     *\n     * \u003cp\u003e\u003cb\u003eNote\u003c/b\u003e: {@link ZipArchiveInputStream} may create\n     * entries that return {@link #SIZE_UNKNOWN SIZE_UNKNOWN} as long\n     * as the entry hasn\u0027t been read completely.\u003c/p\u003e\n     *\n     * @return the entry size\n     ",
      "child_ranges": [
        "(line 664,col 9)-(line 664,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setSize(long)",
      "begin_line": 673,
      "end_line": 679,
      "comment": "\n     * Sets the uncompressed size of the entry data.\n     * @param size the uncompressed size in bytes\n     * @throws IllegalArgumentException if the specified size is less\n     *            than 0\n     ",
      "child_ranges": [
        "(line 675,col 9)-(line 677,col 9)",
        "(line 678,col 9)-(line 678,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setName(java.lang.String, byte[])",
      "begin_line": 690,
      "end_line": 693,
      "comment": "\n     * Sets the name using the raw bytes and the string created from\n     * it by guessing or using the configured encoding.\n     * @param name the name to use created from the raw bytes using\n     * the guessed or configured encoding\n     * @param rawName the bytes originally read as name from the\n     * archive\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 691,col 9)-(line 691,col 22)",
        "(line 692,col 9)-(line 692,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getRawName()",
      "begin_line": 705,
      "end_line": 712,
      "comment": "\n     * Returns the raw bytes that made up the name before it has been\n     * converted using the configured or guessed encoding.\n     *\n     * \u003cp\u003eThis method will return null if this instance has not been\n     * read from an archive.\u003c/p\u003e\n     *\n     * @return the raw name bytes\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 706,col 9)-(line 710,col 9)",
        "(line 711,col 9)-(line 711,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getLocalHeaderOffset()",
      "begin_line": 714,
      "end_line": 716,
      "comment": "",
      "child_ranges": [
        "(line 715,col 9)-(line 715,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setLocalHeaderOffset(long)",
      "begin_line": 718,
      "end_line": 720,
      "comment": "",
      "child_ranges": [
        "(line 719,col 9)-(line 719,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getDataOffset()",
      "begin_line": 722,
      "end_line": 725,
      "comment": "",
      "child_ranges": [
        "(line 724,col 9)-(line 724,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setDataOffset(long)",
      "begin_line": 733,
      "end_line": 735,
      "comment": "\n     * Sets the data offset.\n     *\n     * @param dataOffset\n     *      new value of data offset.\n     ",
      "child_ranges": [
        "(line 734,col 9)-(line 734,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.isStreamContiguous()",
      "begin_line": 737,
      "end_line": 740,
      "comment": "",
      "child_ranges": [
        "(line 739,col 9)-(line 739,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setStreamContiguous(boolean)",
      "begin_line": 742,
      "end_line": 744,
      "comment": "",
      "child_ranges": [
        "(line 743,col 9)-(line 743,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.hashCode()",
      "begin_line": 751,
      "end_line": 758,
      "comment": "\n     * Get the hashCode of the entry.\n     * This uses the name as the hashcode.\n     * @return a hashcode.\n     ",
      "child_ranges": [
        "(line 757,col 9)-(line 757,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getGeneralPurposeBit()",
      "begin_line": 765,
      "end_line": 767,
      "comment": "\n     * The \"general purpose bit\" field.\n     * @return the general purpose bit\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 766,col 9)-(line 766,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setGeneralPurposeBit(org.apache.commons.compress.archivers.zip.GeneralPurposeBit)",
      "begin_line": 774,
      "end_line": 776,
      "comment": "\n     * The \"general purpose bit\" field.\n     * @param b the general purpose bit\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 775,col 9)-(line 775,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.mergeExtraFields(org.apache.commons.compress.archivers.zip.ZipExtraField[], boolean)",
      "begin_line": 786,
      "end_line": 812,
      "comment": "\n     * If there are no extra fields, use the given fields as new extra\n     * data - otherwise merge the fields assuming the existing fields\n     * and the new fields stem from different locations inside the\n     * archive.\n     * @param f the extra fields to merge\n     * @param local whether the new fields originate from local data\n     ",
      "child_ranges": [
        "(line 788,col 9)-(line 811,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getLastModifiedDate()",
      "begin_line": 822,
      "end_line": 825,
      "comment": "\n     * Wraps {@link java.util.zip.ZipEntry#getTime} with a {@link Date} as the\n     * entry\u0027s last modified date.\n     *\n     * \u003cp\u003eChanges to the implementation of {@link java.util.zip.ZipEntry#getTime}\n     * leak through and the returned value may depend on your local\n     * time zone as well as your version of Java.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 824,col 9)-(line 824,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.equals(java.lang.Object)",
      "begin_line": 830,
      "end_line": 872,
      "comment": " (non-Javadoc)\n     * @see java.lang.Object#equals(java.lang.Object)\n     ",
      "child_ranges": [
        "(line 832,col 9)-(line 834,col 9)",
        "(line 835,col 9)-(line 837,col 9)",
        "(line 838,col 9)-(line 838,col 60)",
        "(line 839,col 9)-(line 839,col 40)",
        "(line 840,col 9)-(line 840,col 49)",
        "(line 841,col 9)-(line 847,col 9)",
        "(line 848,col 9)-(line 848,col 40)",
        "(line 849,col 9)-(line 849,col 49)",
        "(line 850,col 9)-(line 852,col 9)",
        "(line 853,col 9)-(line 855,col 9)",
        "(line 856,col 9)-(line 871,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setVersionMadeBy(int)",
      "begin_line": 879,
      "end_line": 881,
      "comment": "\n     * Sets the \"version made by\" field.\n     * @param versionMadeBy \"version made by\" field\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 880,col 9)-(line 880,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setVersionRequired(int)",
      "begin_line": 888,
      "end_line": 890,
      "comment": "\n     * Sets the \"version required to expand\" field.\n     * @param versionRequired \"version required to expand\" field\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 889,col 9)-(line 889,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getVersionRequired()",
      "begin_line": 897,
      "end_line": 899,
      "comment": "\n     * The \"version required to expand\" field.\n     * @return \"version required to expand\" field\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 898,col 9)-(line 898,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getVersionMadeBy()",
      "begin_line": 906,
      "end_line": 908,
      "comment": "\n     * The \"version made by\" field.\n     * @return \"version made by\" field\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 907,col 9)-(line 907,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getRawFlag()",
      "begin_line": 915,
      "end_line": 917,
      "comment": "\n     * The content of the flags field.\n     * @return content of the flags field\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 916,col 9)-(line 916,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setRawFlag(int)",
      "begin_line": 924,
      "end_line": 926,
      "comment": "\n     * Sets the content of the flags field.\n     * @param rawFlag content of the flags field\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 925,col 9)-(line 925,col 31)"
      ]
    }
  ]
}