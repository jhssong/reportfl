{
  "filepath": "/tmp/Compress-47b/src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveEntry.java",
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
      "end_line": 1013,
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
      "begin_line": 116,
      "end_line": 116,
      "comment": "\n     * The {@link java.util.zip.ZipEntry} base class only supports\n     * the compression methods STORED and DEFLATED. We override the\n     * field so that any compression methods can be used.\n     * \u003cp\u003e\n     * The default value -1 means that the method has not been specified.\n     *\n     * @see \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-93\"\n     *        \u003eCOMPRESS-93\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": "\n     * The {@link java.util.zip.ZipEntry#setSize} method in the base\n     * class throws an IllegalArgumentException if the size is bigger\n     * than 2GB for Java versions \u0026lt; 7 and even in Java 7+ if the\n     * implementation in java.util.zip doesn\u0027t support Zip64 itself\n     * (it is an optional feature).\n     *\n     * \u003cp\u003eWe need to keep our own size information for Zip64 support.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "internalAttributes"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "versionRequired"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "versionMadeBy"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "platform"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rawFlag"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "externalAttributes"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "alignment"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "extraFields"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "unparseableExtra"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rawName"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "gpb"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "noExtraFields"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "localHeaderOffset"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dataOffset"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isStreamContiguous"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nameSource"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "commentSource"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry(java.lang.String)",
      "begin_line": 157,
      "end_line": 160,
      "comment": "\n     * Creates a new zip entry with the specified name.\n     *\n     * \u003cp\u003eAssumes the entry represents a directory if and only if the\n     * name ends with a forward slash \"/\".\u003c/p\u003e\n     *\n     * @param name the name of the entry\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 20)",
        "(line 159,col 9)-(line 159,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry(java.util.zip.ZipEntry)",
      "begin_line": 171,
      "end_line": 185,
      "comment": "\n     * Creates a new zip entry with fields taken from the specified zip entry.\n     *\n     * \u003cp\u003eAssumes the entry represents a directory if and only if the\n     * name ends with a forward slash \"/\".\u003c/p\u003e\n     *\n     * @param entry the entry to get fields from\n     * @throws ZipException on error\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 21)",
        "(line 173,col 9)-(line 173,col 33)",
        "(line 174,col 9)-(line 174,col 46)",
        "(line 175,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 37)",
        "(line 184,col 9)-(line 184,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 196,
      "end_line": 205,
      "comment": "\n     * Creates a new zip entry with fields taken from the specified zip entry.\n     *\n     * \u003cp\u003eAssumes the entry represents a directory if and only if the\n     * name ends with a forward slash \"/\".\u003c/p\u003e\n     *\n     * @param entry the entry to get fields from\n     * @throws ZipException on error\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 45)",
        "(line 198,col 9)-(line 198,col 61)",
        "(line 199,col 9)-(line 199,col 61)",
        "(line 200,col 9)-(line 200,col 50)",
        "(line 201,col 9)-(line 201,col 41)",
        "(line 202,col 9)-(line 202,col 69)",
        "(line 203,col 9)-(line 204,col 64)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 224,
      "end_line": 232,
      "comment": "\n     * Creates a new zip entry taking some information from the given\n     * file and using the provided name.\n     *\n     * \u003cp\u003eThe name will be adjusted to end with a forward slash \"/\" if\n     * the file is a directory.  If the file is not a directory a\n     * potential trailing forward slash will be stripped from the\n     * entry name.\u003c/p\u003e\n     * @param inputFile file to create the entry from\n     * @param entryName name of the entry\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 226,col 42)",
        "(line 227,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 230,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.clone()",
      "begin_line": 238,
      "end_line": 246,
      "comment": "\n     * Overwrite clone.\n     * @return a cloned copy of this ZipArchiveEntry\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 66)",
        "(line 242,col 9)-(line 242,col 57)",
        "(line 243,col 9)-(line 243,col 57)",
        "(line 244,col 9)-(line 244,col 52)",
        "(line 245,col 9)-(line 245,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getMethod()",
      "begin_line": 256,
      "end_line": 259,
      "comment": "\n     * Returns the compression method of this entry, or -1 if the\n     * compression method has not been specified.\n     *\n     * @return compression method\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setMethod(int)",
      "begin_line": 268,
      "end_line": 275,
      "comment": "\n     * Sets the compression method of this entry.\n     *\n     * @param method compression method\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 274,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getInternalAttributes()",
      "begin_line": 286,
      "end_line": 288,
      "comment": "\n     * Retrieves the internal file attributes.\n     *\n     * \u003cp\u003e\u003cb\u003eNote\u003c/b\u003e: {@link ZipArchiveInputStream} is unable to fill\n     * this field, you must use {@link ZipFile} if you want to read\n     * entries using this attribute.\u003c/p\u003e\n     *\n     * @return the internal file attributes\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setInternalAttributes(int)",
      "begin_line": 294,
      "end_line": 296,
      "comment": "\n     * Sets the internal file attributes.\n     * @param value an \u003ccode\u003eint\u003c/code\u003e value\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getExternalAttributes()",
      "begin_line": 307,
      "end_line": 309,
      "comment": "\n     * Retrieves the external file attributes.\n     *\n     * \u003cp\u003e\u003cb\u003eNote\u003c/b\u003e: {@link ZipArchiveInputStream} is unable to fill\n     * this field, you must use {@link ZipFile} if you want to read\n     * entries using this attribute.\u003c/p\u003e\n     *\n     * @return the external file attributes\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setExternalAttributes(long)",
      "begin_line": 315,
      "end_line": 317,
      "comment": "\n     * Sets the external file attributes.\n     * @param value an \u003ccode\u003elong\u003c/code\u003e value\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setUnixMode(int)",
      "begin_line": 324,
      "end_line": 333,
      "comment": "\n     * Sets Unix permissions in a way that is understood by Info-Zip\u0027s\n     * unzip command.\n     * @param mode an \u003ccode\u003eint\u003c/code\u003e value\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 330,col 60)",
        "(line 332,col 9)-(line 332,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getUnixMode()",
      "begin_line": 339,
      "end_line": 342,
      "comment": "\n     * Unix permission.\n     * @return the unix permissions\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 341,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.isUnixSymlink()",
      "begin_line": 352,
      "end_line": 354,
      "comment": "\n     * Returns true if this entry represents a unix symlink,\n     * in which case the entry\u0027s content contains the target path\n     * for the symlink.\n     *\n     * @since 1.5\n     * @return true if the entry represents a unix symlink, false otherwise.\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getPlatform()",
      "begin_line": 363,
      "end_line": 365,
      "comment": "\n     * Platform specification to put into the \u0026quot;version made\n     * by\u0026quot; part of the central file header.\n     *\n     * @return PLATFORM_FAT unless {@link #setUnixMode setUnixMode}\n     * has been called, in which case PLATFORM_UNIX will be returned.\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setPlatform(int)",
      "begin_line": 371,
      "end_line": 373,
      "comment": "\n     * Set the platform (UNIX or FAT).\n     * @param platform an \u003ccode\u003eint\u003c/code\u003e value - 0 is FAT, 3 is UNIX\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getAlignment()",
      "begin_line": 382,
      "end_line": 384,
      "comment": "\n     * Gets currently configured alignment.\n     *\n     * @return\n     *      alignment for this entry.\n     * @since 1.14\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setAlignment(int)",
      "begin_line": 393,
      "end_line": 399,
      "comment": "\n     * Sets alignment for this entry.\n     *\n     * @param alignment\n     *      requested alignment, 0 for default.\n     * @since 1.14\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 398,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setExtraFields(org.apache.commons.compress.archivers.zip.ZipExtraField[])",
      "begin_line": 405,
      "end_line": 416,
      "comment": "\n     * Replaces all currently attached extra fields with the new array.\n     * @param fields an array of extra fields\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 64)",
        "(line 407,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 414,col 77)",
        "(line 415,col 9)-(line 415,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getExtraFields()",
      "begin_line": 428,
      "end_line": 430,
      "comment": "\n     * Retrieves all extra fields that have been parsed successfully.\n     *\n     * \u003cp\u003e\u003cb\u003eNote\u003c/b\u003e: The set of extra fields may be incomplete when\n     * {@link ZipArchiveInputStream} has been used as some extra\n     * fields use the central directory to store additional\n     * information.\u003c/p\u003e\n     *\n     * @return an array of the extra fields\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getExtraFields(boolean)",
      "begin_line": 441,
      "end_line": 445,
      "comment": "\n     * Retrieves extra fields.\n     * @param includeUnparseable whether to also return unparseable\n     * extra fields as {@link UnparseableExtraFieldData} if such data\n     * exists.\n     * @return an array of the extra fields\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 444,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getParseableExtraFieldsNoCopy()",
      "begin_line": 447,
      "end_line": 452,
      "comment": "",
      "child_ranges": [
        "(line 448,col 9)-(line 450,col 9)",
        "(line 451,col 9)-(line 451,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getParseableExtraFields()",
      "begin_line": 454,
      "end_line": 457,
      "comment": "",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 85)",
        "(line 456,col 9)-(line 456,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getAllExtraFieldsNoCopy()",
      "begin_line": 463,
      "end_line": 468,
      "comment": "\n     * Get all extra fields, including unparseable ones.\n     * @return An array of all extra fields. Not necessarily a copy of internal data structures, hence private method\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 466,col 9)",
        "(line 467,col 9)-(line 467,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.copyOf(org.apache.commons.compress.archivers.zip.ZipExtraField[])",
      "begin_line": 470,
      "end_line": 472,
      "comment": "",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.copyOf(org.apache.commons.compress.archivers.zip.ZipExtraField[], int)",
      "begin_line": 474,
      "end_line": 478,
      "comment": "",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 62)",
        "(line 476,col 9)-(line 476,col 71)",
        "(line 477,col 9)-(line 477,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getMergedFields()",
      "begin_line": 480,
      "end_line": 484,
      "comment": "",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 91)",
        "(line 482,col 9)-(line 482,col 62)",
        "(line 483,col 9)-(line 483,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getUnparseableOnly()",
      "begin_line": 486,
      "end_line": 488,
      "comment": "",
      "child_ranges": [
        "(line 487,col 9)-(line 487,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getAllExtraFields()",
      "begin_line": 490,
      "end_line": 493,
      "comment": "",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 79)",
        "(line 492,col 9)-(line 492,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.addExtraField(org.apache.commons.compress.archivers.zip.ZipExtraField)",
      "begin_line": 502,
      "end_line": 518,
      "comment": "\n     * Adds an extra field - replacing an already present extra field\n     * of the same type.\n     *\n     * \u003cp\u003eIf no extra field of the same type exists, the field will be\n     * added as last field.\u003c/p\u003e\n     * @param ze an extra field\n     ",
      "child_ranges": [
        "(line 503,col 9)-(line 516,col 9)",
        "(line 517,col 9)-(line 517,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.addAsFirstExtraField(org.apache.commons.compress.archivers.zip.ZipExtraField)",
      "begin_line": 527,
      "end_line": 543,
      "comment": "\n     * Adds an extra field - replacing an already present extra field\n     * of the same type.\n     *\n     * \u003cp\u003eThe new extra field will be the first one.\u003c/p\u003e\n     * @param ze an extra field\n     ",
      "child_ranges": [
        "(line 528,col 9)-(line 541,col 9)",
        "(line 542,col 9)-(line 542,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.removeExtraField(org.apache.commons.compress.archivers.zip.ZipShort)",
      "begin_line": 549,
      "end_line": 565,
      "comment": "\n     * Remove an extra field.\n     * @param type the type of extra field to remove\n     ",
      "child_ranges": [
        "(line 550,col 9)-(line 552,col 9)",
        "(line 554,col 9)-(line 554,col 64)",
        "(line 555,col 9)-(line 559,col 9)",
        "(line 560,col 9)-(line 562,col 9)",
        "(line 563,col 9)-(line 563,col 77)",
        "(line 564,col 9)-(line 564,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.removeUnparseableExtraFieldData()",
      "begin_line": 572,
      "end_line": 578,
      "comment": "\n     * Removes unparseable extra field data.\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 573,col 9)-(line 575,col 9)",
        "(line 576,col 9)-(line 576,col 32)",
        "(line 577,col 9)-(line 577,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getExtraField(org.apache.commons.compress.archivers.zip.ZipShort)",
      "begin_line": 586,
      "end_line": 595,
      "comment": "\n     * Looks up an extra field by its header id.\n     *\n     * @param type the header id\n     * @return null if no such field exists.\n     ",
      "child_ranges": [
        "(line 587,col 9)-(line 593,col 9)",
        "(line 594,col 9)-(line 594,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getUnparseableExtraFieldData()",
      "begin_line": 604,
      "end_line": 606,
      "comment": "\n     * Looks up extra field data that couldn\u0027t be parsed correctly.\n     *\n     * @return null if no such field exists.\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setExtra(byte[])",
      "begin_line": 616,
      "end_line": 628,
      "comment": "\n     * Parses the given bytes as extra field data and consumes any\n     * unparseable data as an {@link UnparseableExtraFieldData}\n     * instance.\n     * @param extra an array of bytes to be parsed into extra fields\n     * @throws RuntimeException if the bytes cannot be parsed\n     * @throws RuntimeException on error\n     ",
      "child_ranges": [
        "(line 618,col 9)-(line 627,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setExtra()",
      "begin_line": 636,
      "end_line": 638,
      "comment": "\n     * Unfortunately {@link java.util.zip.ZipOutputStream\n     * java.util.zip.ZipOutputStream} seems to access the extra data\n     * directly, so overriding getExtra doesn\u0027t help - we need to\n     * modify super\u0027s data directly.\n     ",
      "child_ranges": [
        "(line 637,col 9)-(line 637,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setCentralDirectoryExtra(byte[])",
      "begin_line": 644,
      "end_line": 653,
      "comment": "\n     * Sets the central directory part of extra fields.\n     * @param b an array of bytes to be parsed into extra fields\n     ",
      "child_ranges": [
        "(line 645,col 9)-(line 652,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getLocalFileDataExtra()",
      "begin_line": 659,
      "end_line": 662,
      "comment": "\n     * Retrieves the extra data for the local file data.\n     * @return the extra data for local file\n     ",
      "child_ranges": [
        "(line 660,col 9)-(line 660,col 40)",
        "(line 661,col 9)-(line 661,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getCentralDirectoryExtra()",
      "begin_line": 668,
      "end_line": 670,
      "comment": "\n     * Retrieves the extra data for the central directory.\n     * @return the central directory extra data\n     ",
      "child_ranges": [
        "(line 669,col 9)-(line 669,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getName()",
      "begin_line": 676,
      "end_line": 679,
      "comment": "\n     * Get the name of the entry.\n     * @return the entry name\n     ",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.isDirectory()",
      "begin_line": 685,
      "end_line": 688,
      "comment": "\n     * Is this entry a directory?\n     * @return true if the entry is a directory\n     ",
      "child_ranges": [
        "(line 687,col 9)-(line 687,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setName(java.lang.String)",
      "begin_line": 694,
      "end_line": 700,
      "comment": "\n     * Set the name of the entry.\n     * @param name the name to use\n     ",
      "child_ranges": [
        "(line 695,col 9)-(line 698,col 9)",
        "(line 699,col 9)-(line 699,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getSize()",
      "begin_line": 711,
      "end_line": 714,
      "comment": "\n     * Gets the uncompressed size of the entry data.\n     *\n     * \u003cp\u003e\u003cb\u003eNote\u003c/b\u003e: {@link ZipArchiveInputStream} may create\n     * entries that return {@link #SIZE_UNKNOWN SIZE_UNKNOWN} as long\n     * as the entry hasn\u0027t been read completely.\u003c/p\u003e\n     *\n     * @return the entry size\n     ",
      "child_ranges": [
        "(line 713,col 9)-(line 713,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setSize(long)",
      "begin_line": 722,
      "end_line": 728,
      "comment": "\n     * Sets the uncompressed size of the entry data.\n     * @param size the uncompressed size in bytes\n     * @throws IllegalArgumentException if the specified size is less\n     *            than 0\n     ",
      "child_ranges": [
        "(line 724,col 9)-(line 726,col 9)",
        "(line 727,col 9)-(line 727,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setName(java.lang.String, byte[])",
      "begin_line": 739,
      "end_line": 742,
      "comment": "\n     * Sets the name using the raw bytes and the string created from\n     * it by guessing or using the configured encoding.\n     * @param name the name to use created from the raw bytes using\n     * the guessed or configured encoding\n     * @param rawName the bytes originally read as name from the\n     * archive\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 740,col 9)-(line 740,col 22)",
        "(line 741,col 9)-(line 741,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getRawName()",
      "begin_line": 754,
      "end_line": 761,
      "comment": "\n     * Returns the raw bytes that made up the name before it has been\n     * converted using the configured or guessed encoding.\n     *\n     * \u003cp\u003eThis method will return null if this instance has not been\n     * read from an archive.\u003c/p\u003e\n     *\n     * @return the raw name bytes\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 755,col 9)-(line 759,col 9)",
        "(line 760,col 9)-(line 760,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getLocalHeaderOffset()",
      "begin_line": 763,
      "end_line": 765,
      "comment": "",
      "child_ranges": [
        "(line 764,col 9)-(line 764,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setLocalHeaderOffset(long)",
      "begin_line": 767,
      "end_line": 769,
      "comment": "",
      "child_ranges": [
        "(line 768,col 9)-(line 768,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getDataOffset()",
      "begin_line": 771,
      "end_line": 774,
      "comment": "",
      "child_ranges": [
        "(line 773,col 9)-(line 773,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setDataOffset(long)",
      "begin_line": 782,
      "end_line": 784,
      "comment": "\n     * Sets the data offset.\n     *\n     * @param dataOffset\n     *      new value of data offset.\n     ",
      "child_ranges": [
        "(line 783,col 9)-(line 783,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.isStreamContiguous()",
      "begin_line": 786,
      "end_line": 789,
      "comment": "",
      "child_ranges": [
        "(line 788,col 9)-(line 788,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setStreamContiguous(boolean)",
      "begin_line": 791,
      "end_line": 793,
      "comment": "",
      "child_ranges": [
        "(line 792,col 9)-(line 792,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.hashCode()",
      "begin_line": 800,
      "end_line": 807,
      "comment": "\n     * Get the hashCode of the entry.\n     * This uses the name as the hashcode.\n     * @return a hashcode.\n     ",
      "child_ranges": [
        "(line 806,col 9)-(line 806,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getGeneralPurposeBit()",
      "begin_line": 814,
      "end_line": 816,
      "comment": "\n     * The \"general purpose bit\" field.\n     * @return the general purpose bit\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 815,col 9)-(line 815,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setGeneralPurposeBit(org.apache.commons.compress.archivers.zip.GeneralPurposeBit)",
      "begin_line": 823,
      "end_line": 825,
      "comment": "\n     * The \"general purpose bit\" field.\n     * @param b the general purpose bit\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 824,col 9)-(line 824,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.mergeExtraFields(org.apache.commons.compress.archivers.zip.ZipExtraField[], boolean)",
      "begin_line": 835,
      "end_line": 861,
      "comment": "\n     * If there are no extra fields, use the given fields as new extra\n     * data - otherwise merge the fields assuming the existing fields\n     * and the new fields stem from different locations inside the\n     * archive.\n     * @param f the extra fields to merge\n     * @param local whether the new fields originate from local data\n     ",
      "child_ranges": [
        "(line 837,col 9)-(line 860,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getLastModifiedDate()",
      "begin_line": 871,
      "end_line": 874,
      "comment": "\n     * Wraps {@link java.util.zip.ZipEntry#getTime} with a {@link Date} as the\n     * entry\u0027s last modified date.\n     *\n     * \u003cp\u003eChanges to the implementation of {@link java.util.zip.ZipEntry#getTime}\n     * leak through and the returned value may depend on your local\n     * time zone as well as your version of Java.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 873,col 9)-(line 873,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.equals(java.lang.Object)",
      "begin_line": 879,
      "end_line": 921,
      "comment": " (non-Javadoc)\n     * @see java.lang.Object#equals(java.lang.Object)\n     ",
      "child_ranges": [
        "(line 881,col 9)-(line 883,col 9)",
        "(line 884,col 9)-(line 886,col 9)",
        "(line 887,col 9)-(line 887,col 60)",
        "(line 888,col 9)-(line 888,col 40)",
        "(line 889,col 9)-(line 889,col 49)",
        "(line 890,col 9)-(line 896,col 9)",
        "(line 897,col 9)-(line 897,col 40)",
        "(line 898,col 9)-(line 898,col 49)",
        "(line 899,col 9)-(line 901,col 9)",
        "(line 902,col 9)-(line 904,col 9)",
        "(line 905,col 9)-(line 920,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setVersionMadeBy(int)",
      "begin_line": 928,
      "end_line": 930,
      "comment": "\n     * Sets the \"version made by\" field.\n     * @param versionMadeBy \"version made by\" field\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 929,col 9)-(line 929,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setVersionRequired(int)",
      "begin_line": 937,
      "end_line": 939,
      "comment": "\n     * Sets the \"version required to expand\" field.\n     * @param versionRequired \"version required to expand\" field\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 938,col 9)-(line 938,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getVersionRequired()",
      "begin_line": 946,
      "end_line": 948,
      "comment": "\n     * The \"version required to expand\" field.\n     * @return \"version required to expand\" field\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 947,col 9)-(line 947,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getVersionMadeBy()",
      "begin_line": 955,
      "end_line": 957,
      "comment": "\n     * The \"version made by\" field.\n     * @return \"version made by\" field\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 956,col 9)-(line 956,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getRawFlag()",
      "begin_line": 964,
      "end_line": 966,
      "comment": "\n     * The content of the flags field.\n     * @return content of the flags field\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 965,col 9)-(line 965,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setRawFlag(int)",
      "begin_line": 973,
      "end_line": 975,
      "comment": "\n     * Sets the content of the flags field.\n     * @param rawFlag content of the flags field\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 974,col 9)-(line 974,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getNameSource()",
      "begin_line": 982,
      "end_line": 984,
      "comment": "\n     * The source of the name field value.\n     * @return source of the name field value\n     * @since 1.16\n     ",
      "child_ranges": [
        "(line 983,col 9)-(line 983,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setNameSource(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource)",
      "begin_line": 991,
      "end_line": 993,
      "comment": "\n     * Sets the source of the name field value.\n     * @param nameSource source of the name field value\n     * @since 1.16\n     ",
      "child_ranges": [
        "(line 992,col 9)-(line 992,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getCommentSource()",
      "begin_line": 1000,
      "end_line": 1002,
      "comment": "\n     * The source of the comment field value.\n     * @return source of the comment field value\n     * @since 1.16\n     ",
      "child_ranges": [
        "(line 1001,col 9)-(line 1001,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setCommentSource(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource)",
      "begin_line": 1009,
      "end_line": 1011,
      "comment": "\n     * Sets the source of the comment field value.\n     * @param commentSource source of the comment field value\n     * @since 1.16\n     ",
      "child_ranges": [
        "(line 1010,col 9)-(line 1010,col 43)"
      ]
    }
  ]
}