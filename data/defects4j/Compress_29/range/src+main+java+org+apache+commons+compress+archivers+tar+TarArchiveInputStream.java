{
  "filepath": "/tmp/Compress-29b/src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 48,
      "end_line": 722,
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
        "zipEncoding"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " The encoding of the file "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 77)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, java.lang.String)",
      "begin_line": 94,
      "end_line": 97,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 96,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, int)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param blockSize the block size to use\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, int, java.lang.String)",
      "begin_line": 115,
      "end_line": 118,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param blockSize the block size to use\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, int, int)",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, int, int, java.lang.String)",
      "begin_line": 138,
      "end_line": 145,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 21)",
        "(line 141,col 9)-(line 141,col 31)",
        "(line 142,col 9)-(line 142,col 70)",
        "(line 143,col 9)-(line 143,col 37)",
        "(line 144,col 9)-(line 144,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.close()",
      "begin_line": 151,
      "end_line": 154,
      "comment": "\n     * Closes this stream. Calls the TarBuffer\u0027s close() method.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecordSize()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * Get the record size being used by this stream\u0027s buffer.\n     *\n     * @return The TarBuffer record size.\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.available()",
      "begin_line": 177,
      "end_line": 183,
      "comment": "\n     * Get the available data that can be read from the current\n     * entry in the archive. This does not indicate how much data\n     * is left in the entire archive, only in the current entry.\n     * This value is determined from the entry\u0027s size header field\n     * and the amount of data already read from the current entry.\n     * Integer.MAX_VALUE is returned in case more than Integer.MAX_VALUE\n     * bytes are left in the current entry in the archive.\n     *\n     * @return The number of available bytes for the current entry.\n     * @throws IOException for signature\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.skip(long)",
      "begin_line": 202,
      "end_line": 213,
      "comment": "\n     * Skips over and discards \u003ccode\u003en\u003c/code\u003e bytes of data from this input\n     * stream. The \u003ccode\u003eskip\u003c/code\u003e method may, for a variety of reasons, end\n     * up skipping over some smaller number of bytes, possibly \u003ccode\u003e0\u003c/code\u003e.\n     * This may result from any of a number of conditions; reaching end of file\n     * or end of entry before \u003ccode\u003en\u003c/code\u003e bytes have been skipped; are only\n     * two possibilities. The actual number of bytes skipped is returned. If\n     * \u003ccode\u003en\u003c/code\u003e is negative, no bytes are skipped.\n     * \n     * \n     * @param n\n     *            the number of bytes to be skipped.\n     * @return the actual number of bytes skipped.\n     * @exception IOException\n     *                if some other I/O error occurs.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 206,col 9)",
        "(line 208,col 9)-(line 208,col 55)",
        "(line 209,col 9)-(line 209,col 61)",
        "(line 210,col 9)-(line 210,col 23)",
        "(line 211,col 9)-(line 211,col 31)",
        "(line 212,col 9)-(line 212,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.markSupported()",
      "begin_line": 220,
      "end_line": 223,
      "comment": "\n     * Since we do not support marking just yet, we return false.\n     *\n     * @return False.\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.mark(int)",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\n     * Since we do not support marking just yet, we do nothing.\n     *\n     * @param markLimit The limit to mark.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.reset()",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\n     * Since we do not support marking just yet, we do nothing.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry()",
      "begin_line": 254,
      "end_line": 323,
      "comment": "\n     * Get the next entry in this tar archive. This will skip\n     * over any remaining data in the current entry, if there\n     * is one, and place the input stream at the header of the\n     * next entry, and read the header and instantiate a new\n     * TarEntry from the header bytes and return that entry.\n     * If there are no more entries in the archive, null will\n     * be returned to indicate that the end of the archive has\n     * been reached.\n     *\n     * @return The next TarEntry in the archive, or null.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 257,col 9)",
        "(line 259,col 9)-(line 265,col 9)",
        "(line 267,col 9)-(line 267,col 39)",
        "(line 269,col 9)-(line 273,col 9)",
        "(line 275,col 9)-(line 281,col 9)",
        "(line 283,col 9)-(line 283,col 24)",
        "(line 284,col 9)-(line 284,col 40)",
        "(line 286,col 9)-(line 295,col 9)",
        "(line 297,col 9)-(line 306,col 9)",
        "(line 308,col 9)-(line 310,col 9)",
        "(line 312,col 9)-(line 314,col 9)",
        "(line 320,col 9)-(line 320,col 40)",
        "(line 322,col 9)-(line 322,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.skipRecordPadding()",
      "begin_line": 329,
      "end_line": 336,
      "comment": "\n     * The last record block should be written at the full size, so skip any\n     * additional space used to fill a record after an entry\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 335,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getLongNameData()",
      "begin_line": 344,
      "end_line": 369,
      "comment": "\n     * Get the next entry in this tar archive as longname data.\n     *\n     * @return The next entry in the archive as longname data, or null.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 69)",
        "(line 347,col 9)-(line 347,col 23)",
        "(line 348,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 351,col 23)",
        "(line 352,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 357,col 53)",
        "(line 359,col 9)-(line 359,col 37)",
        "(line 360,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 368,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord()",
      "begin_line": 385,
      "end_line": 394,
      "comment": "\n     * Get the next record in this tar archive. This will skip\n     * over any remaining data in the current entry, if there\n     * is one, and place the input stream at the header of the\n     * next entry.\n     *\n     * \u003cp\u003eIf there are no more entries in the archive, null will be\n     * returned to indicate that the end of the archive has been\n     * reached.  At the same time the {@code hasHitEOF} marker will be\n     * set to true.\u003c/p\u003e\n     *\n     * @return The next header in the archive, or null.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 40)",
        "(line 387,col 9)-(line 387,col 43)",
        "(line 388,col 9)-(line 392,col 9)",
        "(line 393,col 9)-(line 393,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isEOFRecord(byte[])",
      "begin_line": 403,
      "end_line": 405,
      "comment": "\n     * Determine if an archive record indicate End of Archive. End of\n     * archive is indicated by a record that consists entirely of null bytes.\n     *\n     * @param record The record data to check.\n     * @return true if the record data is an End of Archive\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readRecord()",
      "begin_line": 413,
      "end_line": 424,
      "comment": "\n     * Read a record from the input stream and return the data.\n     *\n     * @return The record data or null if EOF has been hit.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 45)",
        "(line 417,col 9)-(line 417,col 52)",
        "(line 418,col 9)-(line 418,col 23)",
        "(line 419,col 9)-(line 421,col 9)",
        "(line 423,col 9)-(line 423,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.paxHeaders()",
      "begin_line": 426,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 60)",
        "(line 428,col 9)-(line 428,col 23)",
        "(line 429,col 9)-(line 429,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.parsePaxHeaders(java.io.InputStream)",
      "begin_line": 432,
      "end_line": 477,
      "comment": "",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 68)",
        "(line 435,col 9)-(line 475,col 9)",
        "(line 476,col 9)-(line 476,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.applyPaxHeadersToCurrentEntry(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 479,
      "end_line": 516,
      "comment": "",
      "child_ranges": [
        "(line 491,col 9)-(line 515,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readGNUSparse()",
      "begin_line": 526,
      "end_line": 545,
      "comment": "\n     * Adds the sparse chunks from the current entry to the sparse chunks,\n     * including any additional sparse entries following the current entry.\n     *\n     * @throws IOException on error\n     *\n     * @todo Sparse files get not yet really processed.\n     ",
      "child_ranges": [
        "(line 531,col 9)-(line 544,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry()",
      "begin_line": 554,
      "end_line": 557,
      "comment": "\n     * Returns the next Archive Entry in this Stream.\n     *\n     * @return the next entry,\n     *         or {@code null} if there are no more entries\n     * @throws IOException if the next entry could not be read\n     ",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.tryToConsumeSecondEOFRecord()",
      "begin_line": 569,
      "end_line": 583,
      "comment": "\n     * Tries to read the next record rewinding the stream if it is not a EOF record.\n     *\n     * \u003cp\u003eThis is meant to protect against cases where a tar\n     * implementation has written only one EOF record when two are\n     * expected.  Actually this won\u0027t help since a non-conforming\n     * implementation likely won\u0027t fill full blocks consisting of - by\n     * default - ten records either so we probably have already read\n     * beyond the archive anyway.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 35)",
        "(line 571,col 9)-(line 571,col 44)",
        "(line 572,col 9)-(line 574,col 9)",
        "(line 575,col 9)-(line 582,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read(byte[], int, int)",
      "begin_line": 598,
      "end_line": 625,
      "comment": "\n     * Reads bytes from the current tar archive entry.\n     *\n     * This method is aware of the boundaries of the current\n     * entry in the archive and will deal with them as if they\n     * were this stream\u0027s start and EOF.\n     *\n     * @param buf The buffer into which to place bytes read.\n     * @param offset The offset at which to place bytes read.\n     * @param numToRead The number of bytes to read.\n     * @return The number of bytes read, or -1 at EOF.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 600,col 6)-(line 600,col 23)",
        "(line 602,col 9)-(line 604,col 9)",
        "(line 606,col 9)-(line 608,col 9)",
        "(line 610,col 9)-(line 610,col 53)",
        "(line 612,col 9)-(line 612,col 52)",
        "(line 614,col 9)-(line 622,col 9)",
        "(line 624,col 9)-(line 624,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 632,
      "end_line": 639,
      "comment": "\n     * Whether this class is able to read the given entry.\n     *\n     * \u003cp\u003eMay return false if the current entry is a sparse file.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 634,col 9)-(line 637,col 9)",
        "(line 638,col 9)-(line 638,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getCurrentEntry()",
      "begin_line": 646,
      "end_line": 648,
      "comment": "\n     * Get the current TAR Archive Entry that this input stream is processing\n     * \n     * @return The current Archive Entry\n     ",
      "child_ranges": [
        "(line 647,col 9)-(line 647,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.setCurrentEntry(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 650,
      "end_line": 652,
      "comment": "",
      "child_ranges": [
        "(line 651,col 9)-(line 651,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isAtEOF()",
      "begin_line": 654,
      "end_line": 656,
      "comment": "",
      "child_ranges": [
        "(line 655,col 9)-(line 655,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.setAtEOF(boolean)",
      "begin_line": 658,
      "end_line": 660,
      "comment": "",
      "child_ranges": [
        "(line 659,col 9)-(line 659,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.consumeRemainderOfLastBlock()",
      "begin_line": 667,
      "end_line": 673,
      "comment": "\n     * This method is invoked once the end of the archive is hit, it\n     * tries to consume the remaining bytes under the assumption that\n     * the tool creating this archive has padded the last block.\n     ",
      "child_ranges": [
        "(line 668,col 9)-(line 668,col 63)",
        "(line 669,col 9)-(line 672,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byte[], int)",
      "begin_line": 684,
      "end_line": 720,
      "comment": "\n     * Checks if the signature matches what is expected for a tar file.\n     *\n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is a tar archive stream, false otherwise\n     ",
      "child_ranges": [
        "(line 685,col 9)-(line 687,col 9)",
        "(line 689,col 9)-(line 696,col 9)",
        "(line 697,col 9)-(line 709,col 9)",
        "(line 711,col 9)-(line 718,col 9)",
        "(line 719,col 9)-(line 719,col 21)"
      ]
    }
  ]
}