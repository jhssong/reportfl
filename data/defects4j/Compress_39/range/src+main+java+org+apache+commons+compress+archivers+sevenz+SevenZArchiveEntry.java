{
  "filepath": "/tmp/Compress-39b/src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SevenZArchiveEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveEntry"
      ],
      "begin_line": 34,
      "end_line": 513,
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
      "end_line": 63,
      "comment": "\n     * Get this entry\u0027s name.\n     *\n     * @return This entry\u0027s name.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setName(java.lang.String)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Set this entry\u0027s name.\n     *\n     * @param name This entry\u0027s new name.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.hasStream()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Whether there is any content associated with this entry.\n     * @return whether there is any content associated with this entry.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setHasStream(boolean)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Sets whether there is any content associated with this entry.\n     * @param hasStream whether there is any content associated with this entry.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.isDirectory()",
      "begin_line": 95,
      "end_line": 98,
      "comment": "\n     * Return whether or not this entry represents a directory.\n     *\n     * @return True if this entry is a directory.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setDirectory(boolean)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Sets whether or not this entry represents a directory.\n     *\n     * @param isDirectory True if this entry is a directory.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.isAntiItem()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Indicates whether this is an \"anti-item\" used in differential backups,\n     * meaning it should delete the same file from a previous backup. \n     * @return true if it is an anti-item, false otherwise\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setAntiItem(boolean)",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * Sets whether this is an \"anti-item\" used in differential backups,\n     * meaning it should delete the same file from a previous backup.\n     * @param isAntiItem true if it is an anti-item, false otherwise \n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getHasCreationDate()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * Returns whether this entry has got a creation date at all.\n     * @return whether the entry has got a creation date\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setHasCreationDate(boolean)",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     * Sets whether this entry has got a creation date at all.\n     * @param hasCreationDate whether the entry has got a creation date\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getCreationDate()",
      "begin_line": 149,
      "end_line": 155,
      "comment": "\n     * Gets the creation date.\n     * @throws UnsupportedOperationException if the entry hasn\u0027t got a\n     * creation date.\n     * @return the creation date\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 154,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setCreationDate(long)",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Sets the creation date using NTFS time (100 nanosecond units\n     * since 1 January 1601)\n     * @param ntfsCreationDate the creation date\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setCreationDate(java.util.Date)",
      "begin_line": 170,
      "end_line": 175,
      "comment": "\n     * Sets the creation date,\n     * @param creationDate the creation date\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 47)",
        "(line 172,col 9)-(line 174,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getHasLastModifiedDate()",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * Returns whether this entry has got a last modified date at all.\n     * @return whether this entry has got a last modified date at all\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setHasLastModifiedDate(boolean)",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * Sets whether this entry has got a last modified date at all.\n     * @param hasLastModifiedDate whether this entry has got a last\n     * modified date at all\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getLastModifiedDate()",
      "begin_line": 200,
      "end_line": 207,
      "comment": "\n     * Gets the last modified date.\n     * @throws UnsupportedOperationException if the entry hasn\u0027t got a\n     * last modified date.\n     * @return the last modified date\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 206,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setLastModifiedDate(long)",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n     * Sets the last modified date using NTFS time (100 nanosecond\n     * units since 1 January 1601)\n     * @param ntfsLastModifiedDate the last modified date\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setLastModifiedDate(java.util.Date)",
      "begin_line": 222,
      "end_line": 227,
      "comment": "\n     * Sets the last modified date,\n     * @param lastModifiedDate the last modified date\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 55)",
        "(line 224,col 9)-(line 226,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getHasAccessDate()",
      "begin_line": 233,
      "end_line": 235,
      "comment": "\n     * Returns whether this entry has got an access date at all.\n     * @return whether this entry has got an access date at all.\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setHasAccessDate(boolean)",
      "begin_line": 241,
      "end_line": 243,
      "comment": "\n     * Sets whether this entry has got an access date at all.\n     * @param hasAcessDate whether this entry has got an access date at all.\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getAccessDate()",
      "begin_line": 251,
      "end_line": 257,
      "comment": "\n     * Gets the access date.\n     * @throws UnsupportedOperationException if the entry hasn\u0027t got a\n     * access date.\n     * @return the access date\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 256,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setAccessDate(long)",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\n     * Sets the access date using NTFS time (100 nanosecond units\n     * since 1 January 1601)\n     * @param ntfsAccessDate the access date\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setAccessDate(java.util.Date)",
      "begin_line": 272,
      "end_line": 277,
      "comment": "\n     * Sets the access date,\n     * @param accessDate the access date\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 43)",
        "(line 274,col 9)-(line 276,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getHasWindowsAttributes()",
      "begin_line": 283,
      "end_line": 285,
      "comment": "\n     * Returns whether this entry has windows attributes.\n     * @return whether this entry has windows attributes.\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setHasWindowsAttributes(boolean)",
      "begin_line": 291,
      "end_line": 293,
      "comment": "\n     * Sets whether this entry has windows attributes.\n     * @param hasWindowsAttributes whether this entry has windows attributes.\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getWindowsAttributes()",
      "begin_line": 299,
      "end_line": 301,
      "comment": "\n     * Gets the windows attributes.\n     * @return the windows attributes\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setWindowsAttributes(int)",
      "begin_line": 307,
      "end_line": 309,
      "comment": "\n     * Sets the windows attributes.\n     * @param windowsAttributes the windows attributes\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getHasCrc()",
      "begin_line": 317,
      "end_line": 319,
      "comment": "\n     * Returns whether this entry has got a crc.\n     *\n     * \u003cp\u003eIn general entries without streams don\u0027t have a CRC either.\u003c/p\u003e\n     * @return whether this entry has got a crc.\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setHasCrc(boolean)",
      "begin_line": 325,
      "end_line": 327,
      "comment": "\n     * Sets whether this entry has got a crc.\n     * @param hasCrc whether this entry has got a crc.\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getCrc()",
      "begin_line": 334,
      "end_line": 337,
      "comment": "\n     * Gets the CRC.\n     * @deprecated use getCrcValue instead.\n     * @return the CRC\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setCrc(int)",
      "begin_line": 344,
      "end_line": 347,
      "comment": "\n     * Sets the CRC.\n     * @deprecated use setCrcValue instead.\n     * @param crc the CRC\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getCrcValue()",
      "begin_line": 354,
      "end_line": 356,
      "comment": "\n     * Gets the CRC.\n     * @since Compress 1.7\n     * @return the CRC\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setCrcValue(long)",
      "begin_line": 363,
      "end_line": 365,
      "comment": "\n     * Sets the CRC.\n     * @since Compress 1.7\n     * @param crc the CRC\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getCompressedCrc()",
      "begin_line": 372,
      "end_line": 375,
      "comment": "\n     * Gets the compressed CRC.\n     * @deprecated use getCompressedCrcValue instead.\n     * @return the compressed CRC\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setCompressedCrc(int)",
      "begin_line": 382,
      "end_line": 385,
      "comment": "\n     * Sets the compressed CRC.\n     * @deprecated use setCompressedCrcValue instead.\n     * @param crc the CRC\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getCompressedCrcValue()",
      "begin_line": 392,
      "end_line": 394,
      "comment": "\n     * Gets the compressed CRC.\n     * @since Compress 1.7\n     * @return the CRC\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setCompressedCrcValue(long)",
      "begin_line": 401,
      "end_line": 403,
      "comment": "\n     * Sets the compressed CRC.\n     * @since Compress 1.7\n     * @param crc the CRC\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getSize()",
      "begin_line": 410,
      "end_line": 413,
      "comment": "\n     * Get this entry\u0027s file size.\n     *\n     * @return This entry\u0027s file size.\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setSize(long)",
      "begin_line": 420,
      "end_line": 422,
      "comment": "\n     * Set this entry\u0027s file size.\n     *\n     * @param size This entry\u0027s new file size.\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getCompressedSize()",
      "begin_line": 429,
      "end_line": 431,
      "comment": "\n     * Get this entry\u0027s compressed file size.\n     *\n     * @return This entry\u0027s compressed file size.\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setCompressedSize(long)",
      "begin_line": 438,
      "end_line": 440,
      "comment": "\n     * Set this entry\u0027s compressed file size.\n     *\n     * @param size This entry\u0027s new compressed file size.\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setContentMethods(java.lang.Iterable\u003c? extends org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration\u003e)",
      "begin_line": 456,
      "end_line": 466,
      "comment": "\n     * Sets the (compression) methods to use for entry\u0027s content - the\n     * default is LZMA2.\n     *\n     * \u003cp\u003eCurrently only {@link SevenZMethod#COPY}, {@link\n     * SevenZMethod#LZMA2}, {@link SevenZMethod#BZIP2} and {@link\n     * SevenZMethod#DEFLATE} are supported when writing archives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe methods will be consulted in iteration order to create\n     * the final output.\u003c/p\u003e\n     *\n     * @param methods the methods to use for the content\n     * @since 1.8\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 465,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getContentMethods()",
      "begin_line": 482,
      "end_line": 484,
      "comment": "\n     * Gets the (compression) methods to use for entry\u0027s content - the\n     * default is LZMA2.\n     *\n     * \u003cp\u003eCurrently only {@link SevenZMethod#COPY}, {@link\n     * SevenZMethod#LZMA2}, {@link SevenZMethod#BZIP2} and {@link\n     * SevenZMethod#DEFLATE} are supported when writing archives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe methods will be consulted in iteration order to create\n     * the final output.\u003c/p\u003e\n     *\n     * @since 1.8\n     * @return the methods to use for the content\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.ntfsTimeToJavaTime(long)",
      "begin_line": 492,
      "end_line": 499,
      "comment": "\n     * Converts NTFS time (100 nanosecond units since 1 January 1601)\n     * to Java time.\n     * @param ntfsTime the NTFS time in 100 nanosecond units\n     * @return the Java time\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 58)",
        "(line 494,col 9)-(line 494,col 61)",
        "(line 495,col 9)-(line 495,col 43)",
        "(line 496,col 9)-(line 496,col 47)",
        "(line 497,col 9)-(line 497,col 83)",
        "(line 498,col 9)-(line 498,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.javaTimeToNtfsTime(java.util.Date)",
      "begin_line": 506,
      "end_line": 512,
      "comment": "\n     * Converts Java time to NTFS time.\n     * @param date the Java time\n     * @return the NTFS time\n     ",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 58)",
        "(line 508,col 9)-(line 508,col 61)",
        "(line 509,col 9)-(line 509,col 43)",
        "(line 510,col 9)-(line 510,col 47)",
        "(line 511,col 9)-(line 511,col 75)"
      ]
    }
  ]
}