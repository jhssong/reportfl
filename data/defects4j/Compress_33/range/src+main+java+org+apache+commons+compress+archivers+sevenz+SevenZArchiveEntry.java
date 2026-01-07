{
  "filepath": "/tmp/Compress-33b/src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SevenZArchiveEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveEntry"
      ],
      "begin_line": 34,
      "end_line": 480,
      "comment": "\n * An entry in a 7z archive.\n * \n * @NotThreadSafe\n * @since 1.6\n "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasStream"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isDirectory"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isAntiItem"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasCreationDate"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasLastModifiedDate"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasAccessDate"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "creationDate"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastModifiedDate"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "accessDate"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasWindowsAttributes"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "windowsAttributes"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasCrc"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crc",
        "compressedCrc"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "size",
        "compressedSize"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "contentMethods"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.SevenZArchiveEntry()",
      "begin_line": 52,
      "end_line": 53,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getName()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Get this entry\u0027s name.\n     *\n     * @return This entry\u0027s name.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setName(java.lang.String)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Set this entry\u0027s name.\n     *\n     * @param name This entry\u0027s new name.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.hasStream()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Whether there is any content associated with this entry.\n     * @return whether there is any content associated with this entry.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setHasStream(boolean)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Sets whether there is any content associated with this entry.\n     * @param hasStream whether there is any content associated with this entry.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.isDirectory()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Return whether or not this entry represents a directory.\n     *\n     * @return True if this entry is a directory.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setDirectory(boolean)",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Sets whether or not this entry represents a directory.\n     *\n     * @param isDirectory True if this entry is a directory.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.isAntiItem()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Indicates whether this is an \"anti-item\" used in differential backups,\n     * meaning it should delete the same file from a previous backup. \n     * @return true if it is an anti-item, false otherwise\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setAntiItem(boolean)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Sets whether this is an \"anti-item\" used in differential backups,\n     * meaning it should delete the same file from a previous backup.\n     * @param isAntiItem true if it is an anti-item, false otherwise \n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getHasCreationDate()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * Returns whether this entry has got a creation date at all.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setHasCreationDate(boolean)",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * Sets whether this entry has got a creation date at all.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getCreationDate()",
      "begin_line": 144,
      "end_line": 151,
      "comment": "\n     * Gets the creation date.\n     * @throws UnsupportedOperationException if the entry hasn\u0027t got a\n     * creation date.\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 150,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setCreationDate(long)",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * Sets the creation date using NTFS time (100 nanosecond units\n     * since 1 January 1601)\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setCreationDate(java.util.Date)",
      "begin_line": 164,
      "end_line": 169,
      "comment": "\n     * Sets the creation date,\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 47)",
        "(line 166,col 9)-(line 168,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getHasLastModifiedDate()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n     * Returns whether this entry has got a last modified date at all.\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setHasLastModifiedDate(boolean)",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * Sets whether this entry has got a last modified date at all.\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getLastModifiedDate()",
      "begin_line": 190,
      "end_line": 197,
      "comment": "\n     * Gets the last modified date.\n     * @throws UnsupportedOperationException if the entry hasn\u0027t got a\n     * last modified date.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 196,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setLastModifiedDate(long)",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\n     * Sets the last modified date using NTFS time (100 nanosecond\n     * units since 1 January 1601)\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setLastModifiedDate(java.util.Date)",
      "begin_line": 210,
      "end_line": 215,
      "comment": "\n     * Sets the last modified date,\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 55)",
        "(line 212,col 9)-(line 214,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getHasAccessDate()",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\n     * Returns whether this entry has got an access date at all.\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setHasAccessDate(boolean)",
      "begin_line": 227,
      "end_line": 229,
      "comment": "\n     * Sets whether this entry has got an access date at all.\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getAccessDate()",
      "begin_line": 236,
      "end_line": 243,
      "comment": "\n     * Gets the access date.\n     * @throws UnsupportedOperationException if the entry hasn\u0027t got a\n     * access date.\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 242,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setAccessDate(long)",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\n     * Sets the access date using NTFS time (100 nanosecond units\n     * since 1 January 1601)\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setAccessDate(java.util.Date)",
      "begin_line": 256,
      "end_line": 261,
      "comment": "\n     * Sets the access date,\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 43)",
        "(line 258,col 9)-(line 260,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getHasWindowsAttributes()",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\n     * Returns whether this entry has windows attributes.\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setHasWindowsAttributes(boolean)",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\n     * Sets whether this entry has windows attributes.\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getWindowsAttributes()",
      "begin_line": 280,
      "end_line": 282,
      "comment": "\n     * Gets the windows attributes.\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setWindowsAttributes(int)",
      "begin_line": 287,
      "end_line": 289,
      "comment": "\n     * Sets the windows attributes.\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getHasCrc()",
      "begin_line": 296,
      "end_line": 298,
      "comment": "\n     * Returns whether this entry has got a crc.\n     *\n     * In general entries without streams don\u0027t have a CRC either.\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setHasCrc(boolean)",
      "begin_line": 303,
      "end_line": 305,
      "comment": "\n     * Sets whether this entry has got a crc.\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getCrc()",
      "begin_line": 311,
      "end_line": 314,
      "comment": "\n     * Gets the CRC.\n     * @deprecated use getCrcValue instead.\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setCrc(int)",
      "begin_line": 320,
      "end_line": 323,
      "comment": "\n     * Sets the CRC.\n     * @deprecated use setCrcValue instead.\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getCrcValue()",
      "begin_line": 329,
      "end_line": 331,
      "comment": "\n     * Gets the CRC.\n     * @since Compress 1.7\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setCrcValue(long)",
      "begin_line": 337,
      "end_line": 339,
      "comment": "\n     * Sets the CRC.\n     * @since Compress 1.7\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getCompressedCrc()",
      "begin_line": 345,
      "end_line": 348,
      "comment": "\n     * Gets the compressed CRC.\n     * @deprecated use getCompressedCrcValue instead.\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setCompressedCrc(int)",
      "begin_line": 354,
      "end_line": 357,
      "comment": "\n     * Sets the compressed CRC.\n     * @deprecated use setCompressedCrcValue instead.\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getCompressedCrcValue()",
      "begin_line": 363,
      "end_line": 365,
      "comment": "\n     * Gets the compressed CRC.\n     * @since Compress 1.7\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setCompressedCrcValue(long)",
      "begin_line": 371,
      "end_line": 373,
      "comment": "\n     * Sets the compressed CRC.\n     * @since Compress 1.7\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getSize()",
      "begin_line": 380,
      "end_line": 382,
      "comment": "\n     * Get this entry\u0027s file size.\n     *\n     * @return This entry\u0027s file size.\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setSize(long)",
      "begin_line": 389,
      "end_line": 391,
      "comment": "\n     * Set this entry\u0027s file size.\n     *\n     * @param size This entry\u0027s new file size.\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getCompressedSize()",
      "begin_line": 398,
      "end_line": 400,
      "comment": "\n     * Get this entry\u0027s compressed file size.\n     *\n     * @return This entry\u0027s compressed file size.\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setCompressedSize(long)",
      "begin_line": 407,
      "end_line": 409,
      "comment": "\n     * Set this entry\u0027s compressed file size.\n     *\n     * @param size This entry\u0027s new compressed file size.\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setContentMethods(java.lang.Iterable\u003c? extends org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration\u003e)",
      "begin_line": 424,
      "end_line": 434,
      "comment": "\n     * Sets the (compression) methods to use for entry\u0027s content - the\n     * default is LZMA2.\n     *\n     * \u003cp\u003eCurrently only {@link SevenZMethod#COPY}, {@link\n     * SevenZMethod#LZMA2}, {@link SevenZMethod#BZIP2} and {@link\n     * SevenZMethod#DEFLATE} are supported when writing archives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe methods will be consulted in iteration order to create\n     * the final output.\u003c/p\u003e\n     *\n     * @since 1.8\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 433,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getContentMethods()",
      "begin_line": 449,
      "end_line": 451,
      "comment": "\n     * Gets the (compression) methods to use for entry\u0027s content - the\n     * default is LZMA2.\n     *\n     * \u003cp\u003eCurrently only {@link SevenZMethod#COPY}, {@link\n     * SevenZMethod#LZMA2}, {@link SevenZMethod#BZIP2} and {@link\n     * SevenZMethod#DEFLATE} are supported when writing archives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe methods will be consulted in iteration order to create\n     * the final output.\u003c/p\u003e\n     *\n     * @since 1.8\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.ntfsTimeToJavaTime(long)",
      "begin_line": 459,
      "end_line": 466,
      "comment": "\n     * Converts NTFS time (100 nanosecond units since 1 January 1601)\n     * to Java time.\n     * @param ntfsTime the NTFS time in 100 nanosecond units\n     * @return the Java time\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 58)",
        "(line 461,col 9)-(line 461,col 61)",
        "(line 462,col 9)-(line 462,col 43)",
        "(line 463,col 9)-(line 463,col 47)",
        "(line 464,col 9)-(line 464,col 83)",
        "(line 465,col 9)-(line 465,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.javaTimeToNtfsTime(java.util.Date)",
      "begin_line": 473,
      "end_line": 479,
      "comment": "\n     * Converts Java time to NTFS time.\n     * @param date the Java time\n     * @return the NTFS time\n     ",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 58)",
        "(line 475,col 9)-(line 475,col 61)",
        "(line 476,col 9)-(line 476,col 43)",
        "(line 477,col 9)-(line 477,col 47)",
        "(line 478,col 9)-(line 478,col 75)"
      ]
    }
  ]
}