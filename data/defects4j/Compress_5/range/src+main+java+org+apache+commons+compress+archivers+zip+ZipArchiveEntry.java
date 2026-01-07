{
  "filepath": "/tmp/Compress-5b/src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveEntry.java",
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
      "begin_line": 32,
      "end_line": 421,
      "comment": "\n * Extension that adds better handling of extra fields and provides\n * access to the internal and external file attributes.\n *\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "PLATFORM_UNIX"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PLATFORM_FAT"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SHORT_MASK"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SHORT_SHIFT"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "internalAttributes"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "platform"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "externalAttributes"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "extraFields"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry(java.lang.String)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Creates a new zip entry with the specified name.\n     * @param name the name of the entry\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry(java.util.zip.ZipEntry)",
      "begin_line": 59,
      "end_line": 69,
      "comment": "\n     * Creates a new zip entry with fields taken from the specified zip entry.\n     * @param entry the entry to get fields from\n     * @throws ZipException on error\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 21)",
        "(line 61,col 9)-(line 61,col 33)",
        "(line 62,col 9)-(line 62,col 40)",
        "(line 63,col 9)-(line 68,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 76,
      "end_line": 81,
      "comment": "\n     * Creates a new zip entry with fields taken from the specified zip entry.\n     * @param entry the entry to get fields from\n     * @throws ZipException on error\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 45)",
        "(line 78,col 9)-(line 78,col 61)",
        "(line 79,col 9)-(line 79,col 61)",
        "(line 80,col 9)-(line 80,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ZipArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 89,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 91,col 42)",
        "(line 92,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.clone()",
      "begin_line": 103,
      "end_line": 111,
      "comment": "\n     * Overwrite clone.\n     * @return a cloned copy of this ZipArchiveEntry\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 60)",
        "(line 106,col 9)-(line 106,col 89)",
        "(line 107,col 9)-(line 107,col 57)",
        "(line 108,col 9)-(line 108,col 57)",
        "(line 109,col 9)-(line 109,col 43)",
        "(line 110,col 9)-(line 110,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getInternalAttributes()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Retrieves the internal file attributes.\n     *\n     * @return the internal file attributes\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setInternalAttributes(int)",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * Sets the internal file attributes.\n     * @param value an \u003ccode\u003eint\u003c/code\u003e value\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getExternalAttributes()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * Retrieves the external file attributes.\n     * @return the external file attributes\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setExternalAttributes(long)",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * Sets the external file attributes.\n     * @param value an \u003ccode\u003elong\u003c/code\u003e value\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setUnixMode(int)",
      "begin_line": 151,
      "end_line": 160,
      "comment": "\n     * Sets Unix permissions in a way that is understood by Info-Zip\u0027s\n     * unzip command.\n     * @param mode an \u003ccode\u003eint\u003c/code\u003e value\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 157,col 60)",
        "(line 159,col 9)-(line 159,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getUnixMode()",
      "begin_line": 166,
      "end_line": 169,
      "comment": "\n     * Unix permission.\n     * @return the unix permissions\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 168,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getPlatform()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n     * Platform specification to put into the \u0026quot;version made\n     * by\u0026quot; part of the central file header.\n     *\n     * @return PLATFORM_FAT unless {@link #setUnixMode setUnixMode}\n     * has been called, in which case PLATORM_UNIX will be returned.\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setPlatform(int)",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\n     * Set the platform (UNIX or FAT).\n     * @param platform an \u003ccode\u003eint\u003c/code\u003e value - 0 is FAT, 3 is UNIX\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setExtraFields(org.apache.commons.compress.archivers.zip.ZipExtraField[])",
      "begin_line": 194,
      "end_line": 200,
      "comment": "\n     * Replaces all currently attached extra fields with the new array.\n     * @param fields an array of extra fields\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 42)",
        "(line 196,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getExtraFields()",
      "begin_line": 206,
      "end_line": 212,
      "comment": "\n     * Retrieves extra fields.\n     * @return an array of the extra fields\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 71)",
        "(line 211,col 9)-(line 211,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.addExtraField(org.apache.commons.compress.archivers.zip.ZipExtraField)",
      "begin_line": 222,
      "end_line": 228,
      "comment": "\n     * Adds an extra fields - replacing an already present extra field\n     * of the same type.\n     *\n     * \u003cp\u003eIf no extra field of the same type exists, the field will be\n     * added as last field.\u003c/p\u003e\n     * @param ze an extra field\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 226,col 46)",
        "(line 227,col 9)-(line 227,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.addAsFirstExtraField(org.apache.commons.compress.archivers.zip.ZipExtraField)",
      "begin_line": 237,
      "end_line": 246,
      "comment": "\n     * Adds an extra fields - replacing an already present extra field\n     * of the same type.\n     *\n     * \u003cp\u003eThe new extra field will be the first one.\u003c/p\u003e\n     * @param ze an extra field\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 41)",
        "(line 239,col 9)-(line 239,col 42)",
        "(line 240,col 9)-(line 240,col 46)",
        "(line 241,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 245,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.removeExtraField(org.apache.commons.compress.archivers.zip.ZipShort)",
      "begin_line": 252,
      "end_line": 260,
      "comment": "\n     * Remove an extra fields.\n     * @param type the type of extra field to remove\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 259,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getExtraField(org.apache.commons.compress.archivers.zip.ZipShort)",
      "begin_line": 267,
      "end_line": 272,
      "comment": "\n     * Looks up an extra field by its header id.\n     *\n     * @return null if no such field exists.\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setExtra(byte[])",
      "begin_line": 280,
      "end_line": 287,
      "comment": "\n     * Throws an Exception if extra data cannot be parsed into extra fields.\n     * @param extra an array of bytes to be parsed into extra fields\n     * @throws RuntimeException if the bytes cannot be parsed\n     * @throws RuntimeException on error\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 286,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setExtra()",
      "begin_line": 295,
      "end_line": 297,
      "comment": "\n     * Unfortunately {@link java.util.zip.ZipOutputStream\n     * java.util.zip.ZipOutputStream} seems to access the extra data\n     * directly, so overriding getExtra doesn\u0027t help - we need to\n     * modify super\u0027s data directly.\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setCentralDirectoryExtra(byte[])",
      "begin_line": 302,
      "end_line": 309,
      "comment": "\n     * Sets the central directory part of extra fields.\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 308,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getLocalFileDataExtra()",
      "begin_line": 315,
      "end_line": 318,
      "comment": "\n     * Retrieves the extra data for the local file data.\n     * @return the extra data for local file\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 34)",
        "(line 317,col 9)-(line 317,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getCentralDirectoryExtra()",
      "begin_line": 324,
      "end_line": 326,
      "comment": "\n     * Retrieves the extra data for the central directory.\n     * @return the central directory extra data\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getName()",
      "begin_line": 332,
      "end_line": 334,
      "comment": "\n     * Get the name of the entry.\n     * @return the entry name\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.isDirectory()",
      "begin_line": 340,
      "end_line": 342,
      "comment": "\n     * Is this entry a directory?\n     * @return true if the entry is a directory\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.setName(java.lang.String)",
      "begin_line": 348,
      "end_line": 350,
      "comment": "\n     * Set the name of the entry.\n     * @param name the name to use\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.hashCode()",
      "begin_line": 357,
      "end_line": 363,
      "comment": "\n     * Get the hashCode of the entry.\n     * This uses the name as the hashcode.\n     * @return a hashcode.\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.mergeExtraFields(org.apache.commons.compress.archivers.zip.ZipExtraField[], boolean)",
      "begin_line": 373,
      "end_line": 394,
      "comment": "\n     * If there are no extra fields, use the given fields as new extra\n     * data - otherwise merge the fields assuming the existing fields\n     * and the new fields stem from different locations inside the\n     * archive.\n     * @param f the extra fields to merge\n     * @param local whether the new fields originate from local data\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 393,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.getLastModifiedDate()",
      "begin_line": 397,
      "end_line": 399,
      "comment": " {@inheritDocs} ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntry.equals(java.lang.Object)",
      "begin_line": 404,
      "end_line": 420,
      "comment": " (non-Javadoc)\n     * @see java.lang.Object#equals(java.lang.Object)\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 411,col 54)",
        "(line 412,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 419,col 20)"
      ]
    }
  ]
}