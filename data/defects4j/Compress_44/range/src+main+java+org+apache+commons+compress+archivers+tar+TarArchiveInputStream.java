{
  "filepath": "/tmp/Compress-44b/src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 48,
      "end_line": 766,
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
        "smallBuf"
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
        "zipEncoding"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " The encoding of the file "
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " the provided encoding (for unit tests)"
    },
    {
      "type": "field",
      "varNames": [
        "globalPaxHeaders"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " the global PAX header"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 77)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, java.lang.String)",
      "begin_line": 98,
      "end_line": 101,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 100,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, int)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param blockSize the block size to use\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, int, java.lang.String)",
      "begin_line": 119,
      "end_line": 122,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param blockSize the block size to use\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, int, int)",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, int, int, java.lang.String)",
      "begin_line": 142,
      "end_line": 150,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 21)",
        "(line 145,col 9)-(line 145,col 31)",
        "(line 146,col 9)-(line 146,col 33)",
        "(line 147,col 9)-(line 147,col 70)",
        "(line 148,col 9)-(line 148,col 37)",
        "(line 149,col 9)-(line 149,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.close()",
      "begin_line": 156,
      "end_line": 159,
      "comment": "\n     * Closes this stream. Calls the TarBuffer\u0027s close() method.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecordSize()",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * Get the record size being used by this stream\u0027s buffer.\n     *\n     * @return The TarBuffer record size.\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.available()",
      "begin_line": 182,
      "end_line": 191,
      "comment": "\n     * Get the available data that can be read from the current\n     * entry in the archive. This does not indicate how much data\n     * is left in the entire archive, only in the current entry.\n     * This value is determined from the entry\u0027s size header field\n     * and the amount of data already read from the current entry.\n     * Integer.MAX_VALUE is returned in case more than Integer.MAX_VALUE\n     * bytes are left in the current entry in the archive.\n     *\n     * @return The number of available bytes for the current entry.\n     * @throws IOException for signature\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.skip(long)",
      "begin_line": 210,
      "end_line": 221,
      "comment": "\n     * Skips over and discards \u003ccode\u003en\u003c/code\u003e bytes of data from this input\n     * stream. The \u003ccode\u003eskip\u003c/code\u003e method may, for a variety of reasons, end\n     * up skipping over some smaller number of bytes, possibly \u003ccode\u003e0\u003c/code\u003e.\n     * This may result from any of a number of conditions; reaching end of file\n     * or end of entry before \u003ccode\u003en\u003c/code\u003e bytes have been skipped; are only\n     * two possibilities. The actual number of bytes skipped is returned. If\n     * \u003ccode\u003en\u003c/code\u003e is negative, no bytes are skipped.\n     * \n     * \n     * @param n\n     *            the number of bytes to be skipped.\n     * @return the actual number of bytes skipped.\n     * @throws IOException\n     *                if some other I/O error occurs.\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 214,col 9)",
        "(line 216,col 9)-(line 216,col 55)",
        "(line 217,col 9)-(line 217,col 61)",
        "(line 218,col 9)-(line 218,col 23)",
        "(line 219,col 9)-(line 219,col 31)",
        "(line 220,col 9)-(line 220,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.markSupported()",
      "begin_line": 228,
      "end_line": 231,
      "comment": "\n     * Since we do not support marking just yet, we return false.\n     *\n     * @return False.\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.mark(int)",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\n     * Since we do not support marking just yet, we do nothing.\n     *\n     * @param markLimit The limit to mark.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.reset()",
      "begin_line": 245,
      "end_line": 247,
      "comment": "\n     * Since we do not support marking just yet, we do nothing.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry()",
      "begin_line": 262,
      "end_line": 335,
      "comment": "\n     * Get the next entry in this tar archive. This will skip\n     * over any remaining data in the current entry, if there\n     * is one, and place the input stream at the header of the\n     * next entry, and read the header and instantiate a new\n     * TarEntry from the header bytes and return that entry.\n     * If there are no more entries in the archive, null will\n     * be returned to indicate that the end of the archive has\n     * been reached.\n     *\n     * @return The next TarEntry in the archive, or null.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 265,col 9)",
        "(line 267,col 9)-(line 273,col 9)",
        "(line 275,col 9)-(line 275,col 45)",
        "(line 277,col 9)-(line 281,col 9)",
        "(line 283,col 9)-(line 287,col 9)",
        "(line 289,col 9)-(line 289,col 24)",
        "(line 290,col 9)-(line 290,col 40)",
        "(line 292,col 9)-(line 301,col 9)",
        "(line 303,col 9)-(line 312,col 9)",
        "(line 314,col 9)-(line 316,col 9)",
        "(line 318,col 9)-(line 322,col 9)",
        "(line 324,col 9)-(line 326,col 9)",
        "(line 332,col 9)-(line 332,col 40)",
        "(line 334,col 9)-(line 334,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.skipRecordPadding()",
      "begin_line": 341,
      "end_line": 348,
      "comment": "\n     * The last record block should be written at the full size, so skip any\n     * additional space used to fill a record after an entry\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 347,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getLongNameData()",
      "begin_line": 356,
      "end_line": 381,
      "comment": "\n     * Get the next entry in this tar archive as longname data.\n     *\n     * @return The next entry in the archive as longname data, or null.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 75)",
        "(line 359,col 9)-(line 359,col 23)",
        "(line 360,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 363,col 23)",
        "(line 364,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 369,col 53)",
        "(line 371,col 9)-(line 371,col 37)",
        "(line 372,col 9)-(line 374,col 9)",
        "(line 375,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 380,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord()",
      "begin_line": 397,
      "end_line": 406,
      "comment": "\n     * Get the next record in this tar archive. This will skip\n     * over any remaining data in the current entry, if there\n     * is one, and place the input stream at the header of the\n     * next entry.\n     *\n     * \u003cp\u003eIf there are no more entries in the archive, null will be\n     * returned to indicate that the end of the archive has been\n     * reached.  At the same time the {@code hasHitEOF} marker will be\n     * set to true.\u003c/p\u003e\n     *\n     * @return The next header in the archive, or null.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 40)",
        "(line 399,col 9)-(line 399,col 43)",
        "(line 400,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 405,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isEOFRecord(byte[])",
      "begin_line": 415,
      "end_line": 417,
      "comment": "\n     * Determine if an archive record indicate End of Archive. End of\n     * archive is indicated by a record that consists entirely of null bytes.\n     *\n     * @param record The record data to check.\n     * @return true if the record data is an End of Archive\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readRecord()",
      "begin_line": 425,
      "end_line": 436,
      "comment": "\n     * Read a record from the input stream and return the data.\n     *\n     * @return The record data or null if EOF has been hit.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 51)",
        "(line 429,col 9)-(line 429,col 58)",
        "(line 430,col 9)-(line 430,col 23)",
        "(line 431,col 9)-(line 433,col 9)",
        "(line 435,col 9)-(line 435,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readGlobalPaxHeaders()",
      "begin_line": 438,
      "end_line": 441,
      "comment": "",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 49)",
        "(line 440,col 9)-(line 440,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.paxHeaders()",
      "begin_line": 443,
      "end_line": 447,
      "comment": "",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 66)",
        "(line 445,col 9)-(line 445,col 23)",
        "(line 446,col 9)-(line 446,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.parsePaxHeaders(java.io.InputStream)",
      "begin_line": 452,
      "end_line": 504,
      "comment": " https://www.gnu.org/software/tar/manual/html_section/tar_92.html#SEC188",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 76)",
        "(line 456,col 9)-(line 502,col 9)",
        "(line 503,col 9)-(line 503,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.applyPaxHeadersToCurrentEntry(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 506,
      "end_line": 556,
      "comment": "",
      "child_ranges": [
        "(line 525,col 9)-(line 555,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readOldGNUSparse()",
      "begin_line": 566,
      "end_line": 585,
      "comment": "\n     * Adds the sparse chunks from the current entry to the sparse chunks,\n     * including any additional sparse entries following the current entry.\n     *\n     * @throws IOException on error\n     *\n     * @todo Sparse files get not yet really processed.\n     ",
      "child_ranges": [
        "(line 571,col 9)-(line 584,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isDirectory()",
      "begin_line": 587,
      "end_line": 589,
      "comment": "",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry()",
      "begin_line": 598,
      "end_line": 601,
      "comment": "\n     * Returns the next Archive Entry in this Stream.\n     *\n     * @return the next entry,\n     *         or {@code null} if there are no more entries\n     * @throws IOException if the next entry could not be read\n     ",
      "child_ranges": [
        "(line 600,col 9)-(line 600,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.tryToConsumeSecondEOFRecord()",
      "begin_line": 613,
      "end_line": 627,
      "comment": "\n     * Tries to read the next record rewinding the stream if it is not a EOF record.\n     *\n     * \u003cp\u003eThis is meant to protect against cases where a tar\n     * implementation has written only one EOF record when two are\n     * expected.  Actually this won\u0027t help since a non-conforming\n     * implementation likely won\u0027t fill full blocks consisting of - by\n     * default - ten records either so we probably have already read\n     * beyond the archive anyway.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 614,col 35)",
        "(line 615,col 9)-(line 615,col 50)",
        "(line 616,col 9)-(line 618,col 9)",
        "(line 619,col 9)-(line 626,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read(byte[], int, int)",
      "begin_line": 642,
      "end_line": 669,
      "comment": "\n     * Reads bytes from the current tar archive entry.\n     *\n     * This method is aware of the boundaries of the current\n     * entry in the archive and will deal with them as if they\n     * were this stream\u0027s start and EOF.\n     *\n     * @param buf The buffer into which to place bytes read.\n     * @param offset The offset at which to place bytes read.\n     * @param numToRead The number of bytes to read.\n     * @return The number of bytes read, or -1 at EOF.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 644,col 6)-(line 644,col 23)",
        "(line 646,col 9)-(line 648,col 9)",
        "(line 650,col 9)-(line 652,col 9)",
        "(line 654,col 9)-(line 654,col 53)",
        "(line 656,col 9)-(line 656,col 52)",
        "(line 658,col 9)-(line 666,col 9)",
        "(line 668,col 9)-(line 668,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 676,
      "end_line": 683,
      "comment": "\n     * Whether this class is able to read the given entry.\n     *\n     * \u003cp\u003eMay return false if the current entry is a sparse file.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 678,col 9)-(line 681,col 9)",
        "(line 682,col 9)-(line 682,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getCurrentEntry()",
      "begin_line": 690,
      "end_line": 692,
      "comment": "\n     * Get the current TAR Archive Entry that this input stream is processing\n     * \n     * @return The current Archive Entry\n     ",
      "child_ranges": [
        "(line 691,col 9)-(line 691,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.setCurrentEntry(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 694,
      "end_line": 696,
      "comment": "",
      "child_ranges": [
        "(line 695,col 9)-(line 695,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isAtEOF()",
      "begin_line": 698,
      "end_line": 700,
      "comment": "",
      "child_ranges": [
        "(line 699,col 9)-(line 699,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.setAtEOF(boolean)",
      "begin_line": 702,
      "end_line": 704,
      "comment": "",
      "child_ranges": [
        "(line 703,col 9)-(line 703,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.consumeRemainderOfLastBlock()",
      "begin_line": 711,
      "end_line": 717,
      "comment": "\n     * This method is invoked once the end of the archive is hit, it\n     * tries to consume the remaining bytes under the assumption that\n     * the tool creating this archive has padded the last block.\n     ",
      "child_ranges": [
        "(line 712,col 9)-(line 712,col 69)",
        "(line 713,col 9)-(line 716,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byte[], int)",
      "begin_line": 728,
      "end_line": 764,
      "comment": "\n     * Checks if the signature matches what is expected for a tar file.\n     *\n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is a tar archive stream, false otherwise\n     ",
      "child_ranges": [
        "(line 729,col 9)-(line 731,col 9)",
        "(line 733,col 9)-(line 740,col 9)",
        "(line 741,col 9)-(line 753,col 9)",
        "(line 755,col 9)-(line 762,col 9)",
        "(line 763,col 9)-(line 763,col 21)"
      ]
    }
  ]
}