{
  "filepath": "/tmp/Compress-21b/src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SevenZArchiveEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveEntry"
      ],
      "begin_line": 32,
      "end_line": 431,
      "comment": "\n * An entry in a 7z archive.\n * \n * @NotThreadSafe\n * @since 1.6\n "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasStream"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isDirectory"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isAntiItem"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasCreationDate"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasLastModifiedDate"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasAccessDate"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "creationDate"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastModifiedDate"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "accessDate"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasWindowsAttributes"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "windowsAttributes"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasCrc"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crc",
        "compressedCrc"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "size",
        "compressedSize"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.SevenZArchiveEntry()",
      "begin_line": 49,
      "end_line": 50,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getName()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Get this entry\u0027s name.\n     *\n     * @return This entry\u0027s name.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setName(java.lang.String)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Set this entry\u0027s name.\n     *\n     * @param name This entry\u0027s new name.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.hasStream()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Whether there is any content associated with this entry.\n     * @return whether there is any content associated with this entry.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setHasStream(boolean)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Sets whether there is any content associated with this entry.\n     * @param hasStream whether there is any content associated with this entry.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.isDirectory()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Return whether or not this entry represents a directory.\n     *\n     * @return True if this entry is a directory.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setDirectory(boolean)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Sets whether or not this entry represents a directory.\n     *\n     * @param isDirectory True if this entry is a directory.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.isAntiItem()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Indicates whether this is an \"anti-item\" used in differential backups,\n     * meaning it should delete the same file from a previous backup. \n     * @return true if it is an anti-item, false otherwise\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setAntiItem(boolean)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Sets whether this is an \"anti-item\" used in differential backups,\n     * meaning it should delete the same file from a previous backup.\n     * @param isAntiItem true if it is an ait-item, false otherwise \n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getHasCreationDate()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * Returns whether this entry has got a creation date at all.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setHasCreationDate(boolean)",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * Sets whether this entry has got a creation date at all.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getCreationDate()",
      "begin_line": 141,
      "end_line": 148,
      "comment": "\n     * Gets the creation date.\n     * @throws UnsupportedOperationException if the entry hasn\u0027t got a\n     * creation date.\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 147,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setCreationDate(long)",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * Sets the creation date using NTFS time (100 nanosecond units\n     * since 1 January 1601)\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setCreationDate(java.util.Date)",
      "begin_line": 161,
      "end_line": 166,
      "comment": "\n     * Sets the creation date,\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 47)",
        "(line 163,col 9)-(line 165,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getHasLastModifiedDate()",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * Returns whether this entry has got a last modified date at all.\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setHasLastModifiedDate(boolean)",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n     * Sets whether this entry has got a last modified date at all.\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getLastModifiedDate()",
      "begin_line": 187,
      "end_line": 194,
      "comment": "\n     * Gets the last modified date.\n     * @throws UnsupportedOperationException if the entry hasn\u0027t got a\n     * last modified date.\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 193,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setLastModifiedDate(long)",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\n     * Sets the last modified date using NTFS time (100 nanosecond\n     * units since 1 January 1601)\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setLastModifiedDate(java.util.Date)",
      "begin_line": 207,
      "end_line": 212,
      "comment": "\n     * Sets the last modified date,\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 55)",
        "(line 209,col 9)-(line 211,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getHasAccessDate()",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n     * Returns whether this entry has got an access date at all.\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setHasAccessDate(boolean)",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n     * Sets whether this entry has got an access date at all.\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getAccessDate()",
      "begin_line": 233,
      "end_line": 240,
      "comment": "\n     * Gets the access date.\n     * @throws UnsupportedOperationException if the entry hasn\u0027t got a\n     * access date.\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 239,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setAccessDate(long)",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\n     * Sets the access date using NTFS time (100 nanosecond units\n     * since 1 January 1601)\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setAccessDate(java.util.Date)",
      "begin_line": 253,
      "end_line": 258,
      "comment": "\n     * Sets the access date,\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 43)",
        "(line 255,col 9)-(line 257,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getHasWindowsAttributes()",
      "begin_line": 263,
      "end_line": 265,
      "comment": "\n     * Returns whether this entry has windows attributes.\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setHasWindowsAttributes(boolean)",
      "begin_line": 270,
      "end_line": 272,
      "comment": "\n     * Sets whether this entry has windows attributes.\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getWindowsAttributes()",
      "begin_line": 277,
      "end_line": 279,
      "comment": "\n     * Gets the windows attributes.\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setWindowsAttributes(int)",
      "begin_line": 284,
      "end_line": 286,
      "comment": "\n     * Sets the windows attributes.\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getHasCrc()",
      "begin_line": 293,
      "end_line": 295,
      "comment": "\n     * Returns whether this entry has got a crc.\n     *\n     * In general entries without streams don\u0027t have a CRC either.\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setHasCrc(boolean)",
      "begin_line": 300,
      "end_line": 302,
      "comment": "\n     * Sets whether this entry has got a crc.\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getCrc()",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\n     * Gets the CRC.\n     * @deprecated use getCrcValue instead.\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setCrc(int)",
      "begin_line": 316,
      "end_line": 318,
      "comment": "\n     * Sets the CRC.\n     * @deprecated use setCrcValue instead.\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getCrcValue()",
      "begin_line": 324,
      "end_line": 326,
      "comment": "\n     * Gets the CRC.\n     * @since Compress 1.7\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setCrcValue(long)",
      "begin_line": 332,
      "end_line": 334,
      "comment": "\n     * Sets the CRC.\n     * @since Compress 1.7\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getCompressedCrc()",
      "begin_line": 340,
      "end_line": 342,
      "comment": "\n     * Gets the compressed CRC.\n     * @deprecated use getCompressedCrcValue instead.\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setCompressedCrc(int)",
      "begin_line": 348,
      "end_line": 350,
      "comment": "\n     * Sets the compressed CRC.\n     * @deprecated use setCompressedCrcValue instead.\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getCompressedCrcValue()",
      "begin_line": 356,
      "end_line": 358,
      "comment": "\n     * Gets the compressed CRC.\n     * @since Compress 1.7\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setCompressedCrcValue(long)",
      "begin_line": 364,
      "end_line": 366,
      "comment": "\n     * Sets the compressed CRC.\n     * @since Compress 1.7\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getSize()",
      "begin_line": 373,
      "end_line": 375,
      "comment": "\n     * Get this entry\u0027s file size.\n     *\n     * @return This entry\u0027s file size.\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setSize(long)",
      "begin_line": 382,
      "end_line": 384,
      "comment": "\n     * Set this entry\u0027s file size.\n     *\n     * @param size This entry\u0027s new file size.\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getCompressedSize()",
      "begin_line": 391,
      "end_line": 393,
      "comment": "\n     * Get this entry\u0027s compressed file size.\n     *\n     * @return This entry\u0027s compressed file size.\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setCompressedSize(long)",
      "begin_line": 400,
      "end_line": 402,
      "comment": "\n     * Set this entry\u0027s compressed file size.\n     *\n     * @param size This entry\u0027s new compressed file size.\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.ntfsTimeToJavaTime(long)",
      "begin_line": 410,
      "end_line": 417,
      "comment": "\n     * Converts NTFS time (100 nanosecond units since 1 January 1601)\n     * to Java time.\n     * @param ntfsTime the NTFS time in 100 nanosecond units\n     * @return the Java time\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 58)",
        "(line 412,col 9)-(line 412,col 61)",
        "(line 413,col 9)-(line 413,col 43)",
        "(line 414,col 9)-(line 414,col 47)",
        "(line 415,col 9)-(line 415,col 83)",
        "(line 416,col 9)-(line 416,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.javaTimeToNtfsTime(java.util.Date)",
      "begin_line": 424,
      "end_line": 430,
      "comment": "\n     * Converts Java time to NTFS time.\n     * @param date the Java time\n     * @return the NTFS time\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 58)",
        "(line 426,col 9)-(line 426,col 61)",
        "(line 427,col 9)-(line 427,col 43)",
        "(line 428,col 9)-(line 428,col 47)",
        "(line 429,col 9)-(line 429,col 75)"
      ]
    }
  ]
}