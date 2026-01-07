{
  "filepath": "/tmp/Compress-2b/src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipArchiveEntry",
      "is_interface": false,
      "parent_types": [
        "java.util.zip.ZipEntry",
        "org.apache.commons.compress.archivers.ArchiveEntry",
        "java.lang.Cloneable"
      ],
      "begin_line": 30,
      "end_line": 383,
      "comment": "\n * Extension that adds better handling of extra fields and provides\n * access to the internal and external file attributes.\n *\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "PLATFORM_UNIX"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PLATFORM_FAT"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SHORT_MASK"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SHORT_SHIFT"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "internalAttributes"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "platform"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "externalAttributes"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "extraFields"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry(java.lang.String)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Creates a new zip entry with the specified name.\n     * @param name the name of the entry\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry(java.util.zip.ZipEntry)",
      "begin_line": 57,
      "end_line": 67,
      "comment": "\n     * Creates a new zip entry with fields taken from the specified zip entry.\n     * @param entry the entry to get fields from\n     * @throws ZipException on error\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 21)",
        "(line 59,col 9)-(line 59,col 33)",
        "(line 60,col 9)-(line 60,col 40)",
        "(line 61,col 9)-(line 66,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 74,
      "end_line": 79,
      "comment": "\n     * Creates a new zip entry with fields taken from the specified zip entry.\n     * @param entry the entry to get fields from\n     * @throws ZipException on error\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 45)",
        "(line 76,col 9)-(line 76,col 61)",
        "(line 77,col 9)-(line 77,col 61)",
        "(line 78,col 9)-(line 78,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.clone()",
      "begin_line": 91,
      "end_line": 99,
      "comment": "\n     * Overwrite clone.\n     * @return a cloned copy of this ZipArchiveEntry\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 60)",
        "(line 94,col 9)-(line 94,col 89)",
        "(line 95,col 9)-(line 95,col 57)",
        "(line 96,col 9)-(line 96,col 57)",
        "(line 97,col 9)-(line 97,col 43)",
        "(line 98,col 9)-(line 98,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getInternalAttributes()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * Retrieves the internal file attributes.\n     *\n     * @return the internal file attributes\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setInternalAttributes(int)",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Sets the internal file attributes.\n     * @param value an \u003ccode\u003eint\u003c/code\u003e value\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getExternalAttributes()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Retrieves the external file attributes.\n     * @return the external file attributes\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setExternalAttributes(long)",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n     * Sets the external file attributes.\n     * @param value an \u003ccode\u003elong\u003c/code\u003e value\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setUnixMode(int)",
      "begin_line": 139,
      "end_line": 148,
      "comment": "\n     * Sets Unix permissions in a way that is understood by Info-Zip\u0027s\n     * unzip command.\n     * @param mode an \u003ccode\u003eint\u003c/code\u003e value\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 145,col 60)",
        "(line 147,col 9)-(line 147,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getUnixMode()",
      "begin_line": 154,
      "end_line": 157,
      "comment": "\n     * Unix permission.\n     * @return the unix permissions\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 156,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getPlatform()",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * Platform specification to put into the \u0026quot;version made\n     * by\u0026quot; part of the central file header.\n     *\n     * @return PLATFORM_FAT unless {@link #setUnixMode setUnixMode}\n     * has been called, in which case PLATORM_UNIX will be returned.\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setPlatform(int)",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n     * Set the platform (UNIX or FAT).\n     * @param platform an \u003ccode\u003eint\u003c/code\u003e value - 0 is FAT, 3 is UNIX\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setExtraFields(org.apache.commons.compress.archivers.zip.ZipExtraField[])",
      "begin_line": 182,
      "end_line": 188,
      "comment": "\n     * Replaces all currently attached extra fields with the new array.\n     * @param fields an array of extra fields\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 42)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getExtraFields()",
      "begin_line": 194,
      "end_line": 200,
      "comment": "\n     * Retrieves extra fields.\n     * @return an array of the extra fields\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 71)",
        "(line 199,col 9)-(line 199,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.addExtraField(org.apache.commons.compress.archivers.zip.ZipExtraField)",
      "begin_line": 210,
      "end_line": 216,
      "comment": "\n     * Adds an extra fields - replacing an already present extra field\n     * of the same type.\n     *\n     * \u003cp\u003eIf no extra field of the same type exists, the field will be\n     * added as last field.\u003c/p\u003e\n     * @param ze an extra field\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 214,col 46)",
        "(line 215,col 9)-(line 215,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.addAsFirstExtraField(org.apache.commons.compress.archivers.zip.ZipExtraField)",
      "begin_line": 225,
      "end_line": 234,
      "comment": "\n     * Adds an extra fields - replacing an already present extra field\n     * of the same type.\n     *\n     * \u003cp\u003eThe new extra field will be the first one.\u003c/p\u003e\n     * @param ze an extra field\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 41)",
        "(line 227,col 9)-(line 227,col 42)",
        "(line 228,col 9)-(line 228,col 46)",
        "(line 229,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 233,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.removeExtraField(org.apache.commons.compress.archivers.zip.ZipShort)",
      "begin_line": 240,
      "end_line": 248,
      "comment": "\n     * Remove an extra fields.\n     * @param type the type of extra field to remove\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 247,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getExtraField(org.apache.commons.compress.archivers.zip.ZipShort)",
      "begin_line": 255,
      "end_line": 260,
      "comment": "\n     * Looks up an extra field by its header id.\n     *\n     * @return null if no such field exists.\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 259,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setExtra(byte[])",
      "begin_line": 268,
      "end_line": 275,
      "comment": "\n     * Throws an Exception if extra data cannot be parsed into extra fields.\n     * @param extra an array of bytes to be parsed into extra fields\n     * @throws RuntimeException if the bytes cannot be parsed\n     * @throws RuntimeException on error\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 274,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setExtra()",
      "begin_line": 283,
      "end_line": 285,
      "comment": "\n     * Unfortunately {@link java.util.zip.ZipOutputStream\n     * java.util.zip.ZipOutputStream} seems to access the extra data\n     * directly, so overriding getExtra doesn\u0027t help - we need to\n     * modify super\u0027s data directly.\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setCentralDirectoryExtra(byte[])",
      "begin_line": 290,
      "end_line": 297,
      "comment": "\n     * Sets the central directory part of extra fields.\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 296,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getLocalFileDataExtra()",
      "begin_line": 303,
      "end_line": 306,
      "comment": "\n     * Retrieves the extra data for the local file data.\n     * @return the extra data for local file\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 34)",
        "(line 305,col 9)-(line 305,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getCentralDirectoryExtra()",
      "begin_line": 312,
      "end_line": 314,
      "comment": "\n     * Retrieves the extra data for the central directory.\n     * @return the central directory extra data\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getName()",
      "begin_line": 320,
      "end_line": 322,
      "comment": "\n     * Get the name of the entry.\n     * @return the entry name\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.isDirectory()",
      "begin_line": 328,
      "end_line": 330,
      "comment": "\n     * Is this entry a directory?\n     * @return true if the entry is a directory\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setName(java.lang.String)",
      "begin_line": 336,
      "end_line": 338,
      "comment": "\n     * Set the name of the entry.\n     * @param name the name to use\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.hashCode()",
      "begin_line": 345,
      "end_line": 351,
      "comment": "\n     * Get the hashCode of the entry.\n     * This uses the name as the hashcode.\n     * @return a hashcode.\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.mergeExtraFields(org.apache.commons.compress.archivers.zip.ZipExtraField[], boolean)",
      "begin_line": 361,
      "end_line": 382,
      "comment": "\n     * If there are no extra fields, use the given fields as new extra\n     * data - otherwise merge the fields assuming the existing fields\n     * and the new fields stem from different locations inside the\n     * archive.\n     * @param f the extra fields to merge\n     * @param local whether the new fields originate from local data\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 381,col 9)"
      ]
    }
  ]
}