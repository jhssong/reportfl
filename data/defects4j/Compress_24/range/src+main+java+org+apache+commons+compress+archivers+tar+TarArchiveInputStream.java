{
  "filepath": "/tmp/Compress-24b/src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 48,
      "end_line": 685,
      "comment": "\n * The TarInputStream reads a UNIX tar archive as an InputStream.\n * methods are provided to position at each successive entry in\n * the archive, and the read each entry as a normal input stream\n * using read().\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "SMALL_BUFFER_SIZE"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SMALL_BUF"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordSize"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " The size the TAR header "
    },
    {
      "type": "field",
      "varNames": [
        "blockSize"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " The size of a block "
    },
    {
      "type": "field",
      "varNames": [
        "hasHitEOF"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " True if file has hit EOF "
    },
    {
      "type": "field",
      "varNames": [
        "entrySize"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Size of the current entry "
    },
    {
      "type": "field",
      "varNames": [
        "entryOffset"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " How far into the entry the stream is at "
    },
    {
      "type": "field",
      "varNames": [
        "is"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " An input stream to read from "
    },
    {
      "type": "field",
      "varNames": [
        "currEntry"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " The meta-data about the current entry "
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " The encoding of the file "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 77)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, java.lang.String)",
      "begin_line": 92,
      "end_line": 95,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 94,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, int)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param blockSize the block size to use\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, int, java.lang.String)",
      "begin_line": 113,
      "end_line": 116,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param blockSize the block size to use\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, int, int)",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, int, int, java.lang.String)",
      "begin_line": 136,
      "end_line": 143,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 21)",
        "(line 139,col 9)-(line 139,col 31)",
        "(line 140,col 9)-(line 140,col 67)",
        "(line 141,col 9)-(line 141,col 37)",
        "(line 142,col 9)-(line 142,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.close()",
      "begin_line": 149,
      "end_line": 152,
      "comment": "\n     * Closes this stream. Calls the TarBuffer\u0027s close() method.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecordSize()",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n     * Get the record size being used by this stream\u0027s buffer.\n     *\n     * @return The TarBuffer record size.\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.available()",
      "begin_line": 175,
      "end_line": 181,
      "comment": "\n     * Get the available data that can be read from the current\n     * entry in the archive. This does not indicate how much data\n     * is left in the entire archive, only in the current entry.\n     * This value is determined from the entry\u0027s size header field\n     * and the amount of data already read from the current entry.\n     * Integer.MAX_VALUE is returned in case more than Integer.MAX_VALUE\n     * bytes are left in the current entry in the archive.\n     *\n     * @return The number of available bytes for the current entry.\n     * @throws IOException for signature\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.skip(long)",
      "begin_line": 193,
      "end_line": 203,
      "comment": "\n     * Skip bytes in the input buffer. This skips bytes in the\n     * current entry\u0027s data, not the entire archive, and will\n     * stop at the end of the current entry\u0027s data if the number\n     * to skip extends beyond that point.\n     *\n     * @param numToSkip The number of bytes to skip.\n     * @return the number actually skipped\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 49)",
        "(line 197,col 9)-(line 197,col 51)",
        "(line 199,col 9)-(line 199,col 51)",
        "(line 200,col 9)-(line 200,col 23)",
        "(line 201,col 9)-(line 201,col 31)",
        "(line 202,col 9)-(line 202,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.reset()",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\n     * Since we do not support marking just yet, we do nothing.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry()",
      "begin_line": 225,
      "end_line": 294,
      "comment": "\n     * Get the next entry in this tar archive. This will skip\n     * over any remaining data in the current entry, if there\n     * is one, and place the input stream at the header of the\n     * next entry, and read the header and instantiate a new\n     * TarEntry from the header bytes and return that entry.\n     * If there are no more entries in the archive, null will\n     * be returned to indicate that the end of the archive has\n     * been reached.\n     *\n     * @return The next TarEntry in the archive, or null.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 228,col 9)",
        "(line 230,col 9)-(line 236,col 9)",
        "(line 238,col 9)-(line 238,col 39)",
        "(line 240,col 9)-(line 244,col 9)",
        "(line 246,col 9)-(line 252,col 9)",
        "(line 254,col 9)-(line 254,col 24)",
        "(line 255,col 9)-(line 255,col 40)",
        "(line 257,col 9)-(line 266,col 9)",
        "(line 268,col 9)-(line 277,col 9)",
        "(line 279,col 9)-(line 281,col 9)",
        "(line 283,col 9)-(line 285,col 9)",
        "(line 291,col 9)-(line 291,col 40)",
        "(line 293,col 9)-(line 293,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.skipRecordPadding()",
      "begin_line": 300,
      "end_line": 307,
      "comment": "\n     * The last record block should be written at the full size, so skip any\n     * additional space used to fill a record after an entry\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 306,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getLongNameData()",
      "begin_line": 315,
      "end_line": 340,
      "comment": "\n     * Get the next entry in this tar archive as longname data.\n     *\n     * @return The next entry in the archive as longname data, or null.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 69)",
        "(line 318,col 9)-(line 318,col 23)",
        "(line 319,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 322,col 23)",
        "(line 323,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 328,col 53)",
        "(line 330,col 9)-(line 330,col 37)",
        "(line 331,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 339,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord()",
      "begin_line": 356,
      "end_line": 365,
      "comment": "\n     * Get the next record in this tar archive. This will skip\n     * over any remaining data in the current entry, if there\n     * is one, and place the input stream at the header of the\n     * next entry.\n     *\n     * \u003cp\u003eIf there are no more entries in the archive, null will be\n     * returned to indicate that the end of the archive has been\n     * reached.  At the same time the {@code hasHitEOF} marker will be\n     * set to true.\u003c/p\u003e\n     *\n     * @return The next header in the archive, or null.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 40)",
        "(line 358,col 9)-(line 358,col 43)",
        "(line 359,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 364,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isEOFRecord(byte[])",
      "begin_line": 374,
      "end_line": 376,
      "comment": "\n     * Determine if an archive record indicate End of Archive. End of\n     * archive is indicated by a record that consists entirely of null bytes.\n     *\n     * @param record The record data to check.\n     * @return true if the record data is an End of Archive\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readRecord()",
      "begin_line": 384,
      "end_line": 395,
      "comment": "\n     * Read a record from the input stream and return the data.\n     *\n     * @return The record data or null if EOF has been hit.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 45)",
        "(line 388,col 9)-(line 388,col 52)",
        "(line 389,col 9)-(line 389,col 23)",
        "(line 390,col 9)-(line 392,col 9)",
        "(line 394,col 9)-(line 394,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.paxHeaders()",
      "begin_line": 397,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 60)",
        "(line 399,col 9)-(line 399,col 23)",
        "(line 400,col 9)-(line 400,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.parsePaxHeaders(java.io.InputStream)",
      "begin_line": 403,
      "end_line": 447,
      "comment": "",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 68)",
        "(line 406,col 9)-(line 445,col 9)",
        "(line 446,col 9)-(line 446,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.applyPaxHeadersToCurrentEntry(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 449,
      "end_line": 486,
      "comment": "",
      "child_ranges": [
        "(line 461,col 9)-(line 485,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readGNUSparse()",
      "begin_line": 496,
      "end_line": 515,
      "comment": "\n     * Adds the sparse chunks from the current entry to the sparse chunks,\n     * including any additional sparse entries following the current entry.\n     *\n     * @throws IOException on error\n     *\n     * @todo Sparse files get not yet really processed.\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 514,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry()",
      "begin_line": 524,
      "end_line": 527,
      "comment": "\n     * Returns the next Archive Entry in this Stream.\n     *\n     * @return the next entry,\n     *         or {@code null} if there are no more entries\n     * @throws IOException if the next entry could not be read\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.tryToConsumeSecondEOFRecord()",
      "begin_line": 539,
      "end_line": 553,
      "comment": "\n     * Tries to read the next record rewinding the stream if it is not a EOF record.\n     *\n     * \u003cp\u003eThis is meant to protect against cases where a tar\n     * implementation has written only one EOF record when two are\n     * expected.  Actually this won\u0027t help since a non-conforming\n     * implementation likely won\u0027t fill full blocks consisting of - by\n     * default - ten records either so we probably have already read\n     * beyond the archive anyway.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 540,col 9)-(line 540,col 35)",
        "(line 541,col 9)-(line 541,col 44)",
        "(line 542,col 9)-(line 544,col 9)",
        "(line 545,col 9)-(line 552,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read(byte[], int, int)",
      "begin_line": 568,
      "end_line": 588,
      "comment": "\n     * Reads bytes from the current tar archive entry.\n     *\n     * This method is aware of the boundaries of the current\n     * entry in the archive and will deal with them as if they\n     * were this stream\u0027s start and EOF.\n     *\n     * @param buf The buffer into which to place bytes read.\n     * @param offset The offset at which to place bytes read.\n     * @param numToRead The number of bytes to read.\n     * @return The number of bytes read, or -1 at EOF.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 570,col 6)-(line 570,col 23)",
        "(line 572,col 9)-(line 574,col 9)",
        "(line 576,col 9)-(line 576,col 53)",
        "(line 578,col 9)-(line 578,col 52)",
        "(line 579,col 9)-(line 579,col 25)",
        "(line 581,col 9)-(line 585,col 9)",
        "(line 587,col 9)-(line 587,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 595,
      "end_line": 602,
      "comment": "\n     * Whether this class is able to read the given entry.\n     *\n     * \u003cp\u003eMay return false if the current entry is a sparse file.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 597,col 9)-(line 600,col 9)",
        "(line 601,col 9)-(line 601,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getCurrentEntry()",
      "begin_line": 609,
      "end_line": 611,
      "comment": "\n     * Get the current TAR Archive Entry that this input stream is processing\n     * \n     * @return The current Archive Entry\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.setCurrentEntry(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 613,
      "end_line": 615,
      "comment": "",
      "child_ranges": [
        "(line 614,col 9)-(line 614,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isAtEOF()",
      "begin_line": 617,
      "end_line": 619,
      "comment": "",
      "child_ranges": [
        "(line 618,col 9)-(line 618,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.setAtEOF(boolean)",
      "begin_line": 621,
      "end_line": 623,
      "comment": "",
      "child_ranges": [
        "(line 622,col 9)-(line 622,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.consumeRemainderOfLastBlock()",
      "begin_line": 630,
      "end_line": 636,
      "comment": "\n     * This method is invoked once the end of the archive is hit, it\n     * tries to consume the remaining bytes under the assumption that\n     * the tool creating this archive has padded the last block.\n     ",
      "child_ranges": [
        "(line 631,col 9)-(line 631,col 63)",
        "(line 632,col 9)-(line 635,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byte[], int)",
      "begin_line": 647,
      "end_line": 683,
      "comment": "\n     * Checks if the signature matches what is expected for a tar file.\n     *\n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is a tar archive stream, false otherwise\n     ",
      "child_ranges": [
        "(line 648,col 9)-(line 650,col 9)",
        "(line 652,col 9)-(line 659,col 9)",
        "(line 660,col 9)-(line 672,col 9)",
        "(line 674,col 9)-(line 681,col 9)",
        "(line 682,col 9)-(line 682,col 21)"
      ]
    }
  ]
}