{
  "filepath": "/tmp/Compress-40b/src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveEntry.java",
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
      "end_line": 860,
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
        "versionRequired"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "versionMadeBy"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "platform"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rawFlag"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "externalAttributes"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "extraFields"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "unparseableExtra"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rawName"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "gpb"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "noExtraFields"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry(java.lang.String)",
      "begin_line": 101,
      "end_line": 104,
      "comment": "\n     * Creates a new zip entry with the specified name.\n     *\n     * \u003cp\u003eAssumes the entry represents a directory if and only if the\n     * name ends with a forward slash \"/\".\u003c/p\u003e\n     *\n     * @param name the name of the entry\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 20)",
        "(line 103,col 9)-(line 103,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry(java.util.zip.ZipEntry)",
      "begin_line": 115,
      "end_line": 129,
      "comment": "\n     * Creates a new zip entry with fields taken from the specified zip entry.\n     *\n     * \u003cp\u003eAssumes the entry represents a directory if and only if the\n     * name ends with a forward slash \"/\".\u003c/p\u003e\n     *\n     * @param entry the entry to get fields from\n     * @throws ZipException on error\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 21)",
        "(line 117,col 9)-(line 117,col 33)",
        "(line 118,col 9)-(line 118,col 46)",
        "(line 119,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 37)",
        "(line 128,col 9)-(line 128,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 140,
      "end_line": 149,
      "comment": "\n     * Creates a new zip entry with fields taken from the specified zip entry.\n     *\n     * \u003cp\u003eAssumes the entry represents a directory if and only if the\n     * name ends with a forward slash \"/\".\u003c/p\u003e\n     *\n     * @param entry the entry to get fields from\n     * @throws ZipException on error\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 45)",
        "(line 142,col 9)-(line 142,col 61)",
        "(line 143,col 9)-(line 143,col 61)",
        "(line 144,col 9)-(line 144,col 50)",
        "(line 145,col 9)-(line 145,col 41)",
        "(line 146,col 9)-(line 146,col 69)",
        "(line 147,col 9)-(line 148,col 64)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 168,
      "end_line": 176,
      "comment": "\n     * Creates a new zip entry taking some information from the given\n     * file and using the provided name.\n     *\n     * \u003cp\u003eThe name will be adjusted to end with a forward slash \"/\" if\n     * the file is a directory.  If the file is not a directory a\n     * potential trailing forward slash will be stripped from the\n     * entry name.\u003c/p\u003e\n     * @param inputFile file to create the entry from\n     * @param entryName name of the entry\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 170,col 42)",
        "(line 171,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.clone()",
      "begin_line": 182,
      "end_line": 190,
      "comment": "\n     * Overwrite clone.\n     * @return a cloned copy of this ZipArchiveEntry\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 66)",
        "(line 186,col 9)-(line 186,col 57)",
        "(line 187,col 9)-(line 187,col 57)",
        "(line 188,col 9)-(line 188,col 52)",
        "(line 189,col 9)-(line 189,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getMethod()",
      "begin_line": 200,
      "end_line": 203,
      "comment": "\n     * Returns the compression method of this entry, or -1 if the\n     * compression method has not been specified.\n     *\n     * @return compression method\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setMethod(int)",
      "begin_line": 212,
      "end_line": 219,
      "comment": "\n     * Sets the compression method of this entry.\n     *\n     * @param method compression method\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getInternalAttributes()",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\n     * Retrieves the internal file attributes.\n     *\n     * \u003cp\u003e\u003cb\u003eNote\u003c/b\u003e: {@link ZipArchiveInputStream} is unable to fill\n     * this field, you must use {@link ZipFile} if you want to read\n     * entries using this attribute.\u003c/p\u003e\n     *\n     * @return the internal file attributes\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setInternalAttributes(int)",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\n     * Sets the internal file attributes.\n     * @param value an \u003ccode\u003eint\u003c/code\u003e value\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getExternalAttributes()",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\n     * Retrieves the external file attributes.\n     *\n     * \u003cp\u003e\u003cb\u003eNote\u003c/b\u003e: {@link ZipArchiveInputStream} is unable to fill\n     * this field, you must use {@link ZipFile} if you want to read\n     * entries using this attribute.\u003c/p\u003e\n     *\n     * @return the external file attributes\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setExternalAttributes(long)",
      "begin_line": 259,
      "end_line": 261,
      "comment": "\n     * Sets the external file attributes.\n     * @param value an \u003ccode\u003elong\u003c/code\u003e value\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setUnixMode(int)",
      "begin_line": 268,
      "end_line": 277,
      "comment": "\n     * Sets Unix permissions in a way that is understood by Info-Zip\u0027s\n     * unzip command.\n     * @param mode an \u003ccode\u003eint\u003c/code\u003e value\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 274,col 60)",
        "(line 276,col 9)-(line 276,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getUnixMode()",
      "begin_line": 283,
      "end_line": 286,
      "comment": "\n     * Unix permission.\n     * @return the unix permissions\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 285,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.isUnixSymlink()",
      "begin_line": 296,
      "end_line": 298,
      "comment": "\n     * Returns true if this entry represents a unix symlink,\n     * in which case the entry\u0027s content contains the target path\n     * for the symlink.\n     *\n     * @since 1.5\n     * @return true if the entry represents a unix symlink, false otherwise.\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getPlatform()",
      "begin_line": 307,
      "end_line": 309,
      "comment": "\n     * Platform specification to put into the \u0026quot;version made\n     * by\u0026quot; part of the central file header.\n     *\n     * @return PLATFORM_FAT unless {@link #setUnixMode setUnixMode}\n     * has been called, in which case PLATFORM_UNIX will be returned.\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setPlatform(int)",
      "begin_line": 315,
      "end_line": 317,
      "comment": "\n     * Set the platform (UNIX or FAT).\n     * @param platform an \u003ccode\u003eint\u003c/code\u003e value - 0 is FAT, 3 is UNIX\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setExtraFields(org.apache.commons.compress.archivers.zip.ZipExtraField[])",
      "begin_line": 323,
      "end_line": 334,
      "comment": "\n     * Replaces all currently attached extra fields with the new array.\n     * @param fields an array of extra fields\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 64)",
        "(line 325,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 332,col 77)",
        "(line 333,col 9)-(line 333,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getExtraFields()",
      "begin_line": 346,
      "end_line": 348,
      "comment": "\n     * Retrieves all extra fields that have been parsed successfully.\n     *\n     * \u003cp\u003e\u003cb\u003eNote\u003c/b\u003e: The set of extra fields may be incomplete when\n     * {@link ZipArchiveInputStream} has been used as some extra\n     * fields use the central directory to store additional\n     * information.\u003c/p\u003e\n     *\n     * @return an array of the extra fields\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getExtraFields(boolean)",
      "begin_line": 359,
      "end_line": 363,
      "comment": "\n     * Retrieves extra fields.\n     * @param includeUnparseable whether to also return unparseable\n     * extra fields as {@link UnparseableExtraFieldData} if such data\n     * exists.\n     * @return an array of the extra fields\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 362,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getParseableExtraFieldsNoCopy()",
      "begin_line": 365,
      "end_line": 370,
      "comment": "",
      "child_ranges": [
        "(line 366,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 369,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getParseableExtraFields()",
      "begin_line": 372,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 85)",
        "(line 374,col 9)-(line 374,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getAllExtraFieldsNoCopy()",
      "begin_line": 381,
      "end_line": 386,
      "comment": "\n     * Get all extra fields, including unparseable ones.\n     * @return An array of all extra fields. Not necessarily a copy of internal data structures, hence private method\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 385,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.copyOf(org.apache.commons.compress.archivers.zip.ZipExtraField[])",
      "begin_line": 388,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.copyOf(org.apache.commons.compress.archivers.zip.ZipExtraField[], int)",
      "begin_line": 392,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 62)",
        "(line 394,col 9)-(line 394,col 71)",
        "(line 395,col 9)-(line 395,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getMergedFields()",
      "begin_line": 398,
      "end_line": 402,
      "comment": "",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 91)",
        "(line 400,col 9)-(line 400,col 62)",
        "(line 401,col 9)-(line 401,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getUnparseableOnly()",
      "begin_line": 404,
      "end_line": 406,
      "comment": "",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getAllExtraFields()",
      "begin_line": 408,
      "end_line": 411,
      "comment": "",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 79)",
        "(line 410,col 9)-(line 410,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.addExtraField(org.apache.commons.compress.archivers.zip.ZipExtraField)",
      "begin_line": 420,
      "end_line": 436,
      "comment": "\n     * Adds an extra field - replacing an already present extra field\n     * of the same type.\n     *\n     * \u003cp\u003eIf no extra field of the same type exists, the field will be\n     * added as last field.\u003c/p\u003e\n     * @param ze an extra field\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 435,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.addAsFirstExtraField(org.apache.commons.compress.archivers.zip.ZipExtraField)",
      "begin_line": 445,
      "end_line": 461,
      "comment": "\n     * Adds an extra field - replacing an already present extra field\n     * of the same type.\n     *\n     * \u003cp\u003eThe new extra field will be the first one.\u003c/p\u003e\n     * @param ze an extra field\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 459,col 9)",
        "(line 460,col 9)-(line 460,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.removeExtraField(org.apache.commons.compress.archivers.zip.ZipShort)",
      "begin_line": 467,
      "end_line": 483,
      "comment": "\n     * Remove an extra field.\n     * @param type the type of extra field to remove\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 470,col 9)",
        "(line 472,col 9)-(line 472,col 64)",
        "(line 473,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 480,col 9)",
        "(line 481,col 9)-(line 481,col 77)",
        "(line 482,col 9)-(line 482,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.removeUnparseableExtraFieldData()",
      "begin_line": 490,
      "end_line": 496,
      "comment": "\n     * Removes unparseable extra field data.\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 493,col 9)",
        "(line 494,col 9)-(line 494,col 32)",
        "(line 495,col 9)-(line 495,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getExtraField(org.apache.commons.compress.archivers.zip.ZipShort)",
      "begin_line": 504,
      "end_line": 513,
      "comment": "\n     * Looks up an extra field by its header id.\n     *\n     * @param type the header id\n     * @return null if no such field exists.\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 511,col 9)",
        "(line 512,col 9)-(line 512,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getUnparseableExtraFieldData()",
      "begin_line": 522,
      "end_line": 524,
      "comment": "\n     * Looks up extra field data that couldn\u0027t be parsed correctly.\n     *\n     * @return null if no such field exists.\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 523,col 9)-(line 523,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setExtra(byte[])",
      "begin_line": 534,
      "end_line": 546,
      "comment": "\n     * Parses the given bytes as extra field data and consumes any\n     * unparseable data as an {@link UnparseableExtraFieldData}\n     * instance.\n     * @param extra an array of bytes to be parsed into extra fields\n     * @throws RuntimeException if the bytes cannot be parsed\n     * @throws RuntimeException on error\n     ",
      "child_ranges": [
        "(line 536,col 9)-(line 545,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setExtra()",
      "begin_line": 554,
      "end_line": 556,
      "comment": "\n     * Unfortunately {@link java.util.zip.ZipOutputStream\n     * java.util.zip.ZipOutputStream} seems to access the extra data\n     * directly, so overriding getExtra doesn\u0027t help - we need to\n     * modify super\u0027s data directly.\n     ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setCentralDirectoryExtra(byte[])",
      "begin_line": 562,
      "end_line": 571,
      "comment": "\n     * Sets the central directory part of extra fields.\n     * @param b an array of bytes to be parsed into extra fields\n     ",
      "child_ranges": [
        "(line 563,col 9)-(line 570,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getLocalFileDataExtra()",
      "begin_line": 577,
      "end_line": 580,
      "comment": "\n     * Retrieves the extra data for the local file data.\n     * @return the extra data for local file\n     ",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 40)",
        "(line 579,col 9)-(line 579,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getCentralDirectoryExtra()",
      "begin_line": 586,
      "end_line": 588,
      "comment": "\n     * Retrieves the extra data for the central directory.\n     * @return the central directory extra data\n     ",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getName()",
      "begin_line": 594,
      "end_line": 597,
      "comment": "\n     * Get the name of the entry.\n     * @return the entry name\n     ",
      "child_ranges": [
        "(line 596,col 9)-(line 596,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.isDirectory()",
      "begin_line": 603,
      "end_line": 606,
      "comment": "\n     * Is this entry a directory?\n     * @return true if the entry is a directory\n     ",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setName(java.lang.String)",
      "begin_line": 612,
      "end_line": 618,
      "comment": "\n     * Set the name of the entry.\n     * @param name the name to use\n     ",
      "child_ranges": [
        "(line 613,col 9)-(line 616,col 9)",
        "(line 617,col 9)-(line 617,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getSize()",
      "begin_line": 629,
      "end_line": 632,
      "comment": "\n     * Gets the uncompressed size of the entry data.\n     *\n     * \u003cp\u003e\u003cb\u003eNote\u003c/b\u003e: {@link ZipArchiveInputStream} may create\n     * entries that return {@link #SIZE_UNKNOWN SIZE_UNKNOWN} as long\n     * as the entry hasn\u0027t been read completely.\u003c/p\u003e\n     *\n     * @return the entry size\n     ",
      "child_ranges": [
        "(line 631,col 9)-(line 631,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setSize(long)",
      "begin_line": 640,
      "end_line": 646,
      "comment": "\n     * Sets the uncompressed size of the entry data.\n     * @param size the uncompressed size in bytes\n     * @throws IllegalArgumentException if the specified size is less\n     *            than 0\n     ",
      "child_ranges": [
        "(line 642,col 9)-(line 644,col 9)",
        "(line 645,col 9)-(line 645,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setName(java.lang.String, byte[])",
      "begin_line": 657,
      "end_line": 660,
      "comment": "\n     * Sets the name using the raw bytes and the string created from\n     * it by guessing or using the configured encoding.\n     * @param name the name to use created from the raw bytes using\n     * the guessed or configured encoding\n     * @param rawName the bytes originally read as name from the\n     * archive\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 658,col 9)-(line 658,col 22)",
        "(line 659,col 9)-(line 659,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getRawName()",
      "begin_line": 672,
      "end_line": 679,
      "comment": "\n     * Returns the raw bytes that made up the name before it has been\n     * converted using the configured or guessed encoding.\n     *\n     * \u003cp\u003eThis method will return null if this instance has not been\n     * read from an archive.\u003c/p\u003e\n     *\n     * @return the raw name bytes\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 673,col 9)-(line 677,col 9)",
        "(line 678,col 9)-(line 678,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.hashCode()",
      "begin_line": 686,
      "end_line": 693,
      "comment": "\n     * Get the hashCode of the entry.\n     * This uses the name as the hashcode.\n     * @return a hashcode.\n     ",
      "child_ranges": [
        "(line 692,col 9)-(line 692,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getGeneralPurposeBit()",
      "begin_line": 700,
      "end_line": 702,
      "comment": "\n     * The \"general purpose bit\" field.\n     * @return the general purpose bit\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 701,col 9)-(line 701,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setGeneralPurposeBit(org.apache.commons.compress.archivers.zip.GeneralPurposeBit)",
      "begin_line": 709,
      "end_line": 711,
      "comment": "\n     * The \"general purpose bit\" field.\n     * @param b the general purpose bit\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 710,col 9)-(line 710,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.mergeExtraFields(org.apache.commons.compress.archivers.zip.ZipExtraField[], boolean)",
      "begin_line": 721,
      "end_line": 747,
      "comment": "\n     * If there are no extra fields, use the given fields as new extra\n     * data - otherwise merge the fields assuming the existing fields\n     * and the new fields stem from different locations inside the\n     * archive.\n     * @param f the extra fields to merge\n     * @param local whether the new fields originate from local data\n     ",
      "child_ranges": [
        "(line 723,col 9)-(line 746,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getLastModifiedDate()",
      "begin_line": 757,
      "end_line": 760,
      "comment": "\n     * Wraps {@link java.util.zip.ZipEntry#getTime} with a {@link Date} as the\n     * entry\u0027s last modified date.\n     *\n     * \u003cp\u003eChanges to the implementation of {@link java.util.zip.ZipEntry#getTime}\n     * leak through and the returned value may depend on your local\n     * time zone as well as your version of Java.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 759,col 9)-(line 759,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.equals(java.lang.Object)",
      "begin_line": 765,
      "end_line": 805,
      "comment": " (non-Javadoc)\n     * @see java.lang.Object#equals(java.lang.Object)\n     ",
      "child_ranges": [
        "(line 767,col 9)-(line 769,col 9)",
        "(line 770,col 9)-(line 772,col 9)",
        "(line 773,col 9)-(line 773,col 60)",
        "(line 774,col 9)-(line 774,col 40)",
        "(line 775,col 9)-(line 775,col 49)",
        "(line 776,col 9)-(line 782,col 9)",
        "(line 783,col 9)-(line 783,col 40)",
        "(line 784,col 9)-(line 784,col 49)",
        "(line 785,col 9)-(line 787,col 9)",
        "(line 788,col 9)-(line 790,col 9)",
        "(line 791,col 9)-(line 804,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setVersionMadeBy(int)",
      "begin_line": 812,
      "end_line": 814,
      "comment": "\n     * Sets the \"version made by\" field.\n     * @param versionMadeBy \"version made by\" field\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 813,col 9)-(line 813,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setVersionRequired(int)",
      "begin_line": 821,
      "end_line": 823,
      "comment": "\n     * Sets the \"version required to expand\" field.\n     * @param versionRequired \"version required to expand\" field\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 822,col 9)-(line 822,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getVersionRequired()",
      "begin_line": 830,
      "end_line": 832,
      "comment": "\n     * The \"version required to expand\" field.\n     * @return \"version required to expand\" field\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 831,col 9)-(line 831,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getVersionMadeBy()",
      "begin_line": 839,
      "end_line": 841,
      "comment": "\n     * The \"version made by\" field.\n     * @return \"version made by\" field\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 840,col 9)-(line 840,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getRawFlag()",
      "begin_line": 848,
      "end_line": 850,
      "comment": "\n     * The content of the flags field.\n     * @return content of the flags field\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 849,col 9)-(line 849,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setRawFlag(int)",
      "begin_line": 857,
      "end_line": 859,
      "comment": "\n     * Sets the content of the flags field.\n     * @param rawFlag content of the flags field\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 858,col 9)-(line 858,col 31)"
      ]
    }
  ]
}