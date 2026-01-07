{
  "filepath": "/tmp/Compress-46b/src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 47,
      "end_line": 718,
      "comment": "\n * The TarInputStream reads a UNIX tar archive as an InputStream.\n * methods are provided to position at each successive entry in\n * the archive, and the read each entry as a normal input stream\n * using read().\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "SMALL_BUFFER_SIZE"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "smallBuf"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordSize"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " The size the TAR header "
    },
    {
      "type": "field",
      "varNames": [
        "blockSize"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " The size of a block "
    },
    {
      "type": "field",
      "varNames": [
        "hasHitEOF"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " True if file has hit EOF "
    },
    {
      "type": "field",
      "varNames": [
        "entrySize"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Size of the current entry "
    },
    {
      "type": "field",
      "varNames": [
        "entryOffset"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " How far into the entry the stream is at "
    },
    {
      "type": "field",
      "varNames": [
        "is"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " An input stream to read from "
    },
    {
      "type": "field",
      "varNames": [
        "currEntry"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The meta-data about the current entry "
    },
    {
      "type": "field",
      "varNames": [
        "zipEncoding"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " The encoding of the file "
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " the provided encoding (for unit tests)"
    },
    {
      "type": "field",
      "varNames": [
        "globalPaxHeaders"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " the global PAX header"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 77)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, java.lang.String)",
      "begin_line": 97,
      "end_line": 100,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 99,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, int)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param blockSize the block size to use\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, int, java.lang.String)",
      "begin_line": 118,
      "end_line": 121,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param blockSize the block size to use\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, int, int)",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, int, int, java.lang.String)",
      "begin_line": 141,
      "end_line": 149,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 21)",
        "(line 144,col 9)-(line 144,col 31)",
        "(line 145,col 9)-(line 145,col 33)",
        "(line 146,col 9)-(line 146,col 70)",
        "(line 147,col 9)-(line 147,col 37)",
        "(line 148,col 9)-(line 148,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.close()",
      "begin_line": 155,
      "end_line": 158,
      "comment": "\n     * Closes this stream. Calls the TarBuffer\u0027s close() method.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecordSize()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * Get the record size being used by this stream\u0027s buffer.\n     *\n     * @return The TarBuffer record size.\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.available()",
      "begin_line": 181,
      "end_line": 190,
      "comment": "\n     * Get the available data that can be read from the current\n     * entry in the archive. This does not indicate how much data\n     * is left in the entire archive, only in the current entry.\n     * This value is determined from the entry\u0027s size header field\n     * and the amount of data already read from the current entry.\n     * Integer.MAX_VALUE is returned in case more than Integer.MAX_VALUE\n     * bytes are left in the current entry in the archive.\n     *\n     * @return The number of available bytes for the current entry.\n     * @throws IOException for signature\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.skip(long)",
      "begin_line": 209,
      "end_line": 220,
      "comment": "\n     * Skips over and discards \u003ccode\u003en\u003c/code\u003e bytes of data from this input\n     * stream. The \u003ccode\u003eskip\u003c/code\u003e method may, for a variety of reasons, end\n     * up skipping over some smaller number of bytes, possibly \u003ccode\u003e0\u003c/code\u003e.\n     * This may result from any of a number of conditions; reaching end of file\n     * or end of entry before \u003ccode\u003en\u003c/code\u003e bytes have been skipped; are only\n     * two possibilities. The actual number of bytes skipped is returned. If\n     * \u003ccode\u003en\u003c/code\u003e is negative, no bytes are skipped.\n     * \n     * \n     * @param n\n     *            the number of bytes to be skipped.\n     * @return the actual number of bytes skipped.\n     * @throws IOException\n     *                if some other I/O error occurs.\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 213,col 9)",
        "(line 215,col 9)-(line 215,col 55)",
        "(line 216,col 9)-(line 216,col 61)",
        "(line 217,col 9)-(line 217,col 23)",
        "(line 218,col 9)-(line 218,col 31)",
        "(line 219,col 9)-(line 219,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.markSupported()",
      "begin_line": 227,
      "end_line": 230,
      "comment": "\n     * Since we do not support marking just yet, we return false.\n     *\n     * @return False.\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.mark(int)",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\n     * Since we do not support marking just yet, we do nothing.\n     *\n     * @param markLimit The limit to mark.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.reset()",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\n     * Since we do not support marking just yet, we do nothing.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry()",
      "begin_line": 261,
      "end_line": 334,
      "comment": "\n     * Get the next entry in this tar archive. This will skip\n     * over any remaining data in the current entry, if there\n     * is one, and place the input stream at the header of the\n     * next entry, and read the header and instantiate a new\n     * TarEntry from the header bytes and return that entry.\n     * If there are no more entries in the archive, null will\n     * be returned to indicate that the end of the archive has\n     * been reached.\n     *\n     * @return The next TarEntry in the archive, or null.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 264,col 9)",
        "(line 266,col 9)-(line 272,col 9)",
        "(line 274,col 9)-(line 274,col 45)",
        "(line 276,col 9)-(line 280,col 9)",
        "(line 282,col 9)-(line 286,col 9)",
        "(line 288,col 9)-(line 288,col 24)",
        "(line 289,col 9)-(line 289,col 40)",
        "(line 291,col 9)-(line 300,col 9)",
        "(line 302,col 9)-(line 311,col 9)",
        "(line 313,col 9)-(line 315,col 9)",
        "(line 317,col 9)-(line 321,col 9)",
        "(line 323,col 9)-(line 325,col 9)",
        "(line 331,col 9)-(line 331,col 40)",
        "(line 333,col 9)-(line 333,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.skipRecordPadding()",
      "begin_line": 340,
      "end_line": 347,
      "comment": "\n     * The last record block should be written at the full size, so skip any\n     * additional space used to fill a record after an entry\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 346,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getLongNameData()",
      "begin_line": 355,
      "end_line": 380,
      "comment": "\n     * Get the next entry in this tar archive as longname data.\n     *\n     * @return The next entry in the archive as longname data, or null.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 75)",
        "(line 358,col 9)-(line 358,col 23)",
        "(line 359,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 362,col 23)",
        "(line 363,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 368,col 53)",
        "(line 370,col 9)-(line 370,col 37)",
        "(line 371,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 378,col 9)",
        "(line 379,col 9)-(line 379,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord()",
      "begin_line": 396,
      "end_line": 405,
      "comment": "\n     * Get the next record in this tar archive. This will skip\n     * over any remaining data in the current entry, if there\n     * is one, and place the input stream at the header of the\n     * next entry.\n     *\n     * \u003cp\u003eIf there are no more entries in the archive, null will be\n     * returned to indicate that the end of the archive has been\n     * reached.  At the same time the {@code hasHitEOF} marker will be\n     * set to true.\u003c/p\u003e\n     *\n     * @return The next header in the archive, or null.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 40)",
        "(line 398,col 9)-(line 398,col 41)",
        "(line 399,col 9)-(line 403,col 9)",
        "(line 404,col 9)-(line 404,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isEOFRecord(byte[])",
      "begin_line": 414,
      "end_line": 416,
      "comment": "\n     * Determine if an archive record indicate End of Archive. End of\n     * archive is indicated by a record that consists entirely of null bytes.\n     *\n     * @param record The record data to check.\n     * @return true if the record data is an End of Archive\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readRecord()",
      "begin_line": 424,
      "end_line": 435,
      "comment": "\n     * Read a record from the input stream and return the data.\n     *\n     * @return The record data or null if EOF has been hit.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 51)",
        "(line 428,col 9)-(line 428,col 58)",
        "(line 429,col 9)-(line 429,col 23)",
        "(line 430,col 9)-(line 432,col 9)",
        "(line 434,col 9)-(line 434,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readGlobalPaxHeaders()",
      "begin_line": 437,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 49)",
        "(line 439,col 9)-(line 439,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.paxHeaders()",
      "begin_line": 442,
      "end_line": 446,
      "comment": "",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 66)",
        "(line 444,col 9)-(line 444,col 23)",
        "(line 445,col 9)-(line 445,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.parsePaxHeaders(java.io.InputStream)",
      "begin_line": 451,
      "end_line": 503,
      "comment": " https://www.gnu.org/software/tar/manual/html_section/tar_92.html#SEC188",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 76)",
        "(line 455,col 9)-(line 501,col 9)",
        "(line 502,col 9)-(line 502,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.applyPaxHeadersToCurrentEntry(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 505,
      "end_line": 508,
      "comment": "",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readOldGNUSparse()",
      "begin_line": 518,
      "end_line": 537,
      "comment": "\n     * Adds the sparse chunks from the current entry to the sparse chunks,\n     * including any additional sparse entries following the current entry.\n     *\n     * @throws IOException on error\n     *\n     * @todo Sparse files get not yet really processed.\n     ",
      "child_ranges": [
        "(line 523,col 9)-(line 536,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isDirectory()",
      "begin_line": 539,
      "end_line": 541,
      "comment": "",
      "child_ranges": [
        "(line 540,col 9)-(line 540,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry()",
      "begin_line": 550,
      "end_line": 553,
      "comment": "\n     * Returns the next Archive Entry in this Stream.\n     *\n     * @return the next entry,\n     *         or {@code null} if there are no more entries\n     * @throws IOException if the next entry could not be read\n     ",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.tryToConsumeSecondEOFRecord()",
      "begin_line": 565,
      "end_line": 579,
      "comment": "\n     * Tries to read the next record rewinding the stream if it is not a EOF record.\n     *\n     * \u003cp\u003eThis is meant to protect against cases where a tar\n     * implementation has written only one EOF record when two are\n     * expected.  Actually this won\u0027t help since a non-conforming\n     * implementation likely won\u0027t fill full blocks consisting of - by\n     * default - ten records either so we probably have already read\n     * beyond the archive anyway.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 35)",
        "(line 567,col 9)-(line 567,col 50)",
        "(line 568,col 9)-(line 570,col 9)",
        "(line 571,col 9)-(line 578,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read(byte[], int, int)",
      "begin_line": 594,
      "end_line": 621,
      "comment": "\n     * Reads bytes from the current tar archive entry.\n     *\n     * This method is aware of the boundaries of the current\n     * entry in the archive and will deal with them as if they\n     * were this stream\u0027s start and EOF.\n     *\n     * @param buf The buffer into which to place bytes read.\n     * @param offset The offset at which to place bytes read.\n     * @param numToRead The number of bytes to read.\n     * @return The number of bytes read, or -1 at EOF.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 596,col 6)-(line 596,col 23)",
        "(line 598,col 9)-(line 600,col 9)",
        "(line 602,col 9)-(line 604,col 9)",
        "(line 606,col 9)-(line 606,col 53)",
        "(line 608,col 9)-(line 608,col 52)",
        "(line 610,col 9)-(line 618,col 9)",
        "(line 620,col 9)-(line 620,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 628,
      "end_line": 635,
      "comment": "\n     * Whether this class is able to read the given entry.\n     *\n     * \u003cp\u003eMay return false if the current entry is a sparse file.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 630,col 9)-(line 633,col 9)",
        "(line 634,col 9)-(line 634,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getCurrentEntry()",
      "begin_line": 642,
      "end_line": 644,
      "comment": "\n     * Get the current TAR Archive Entry that this input stream is processing\n     * \n     * @return The current Archive Entry\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 643,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.setCurrentEntry(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 646,
      "end_line": 648,
      "comment": "",
      "child_ranges": [
        "(line 647,col 9)-(line 647,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isAtEOF()",
      "begin_line": 650,
      "end_line": 652,
      "comment": "",
      "child_ranges": [
        "(line 651,col 9)-(line 651,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.setAtEOF(boolean)",
      "begin_line": 654,
      "end_line": 656,
      "comment": "",
      "child_ranges": [
        "(line 655,col 9)-(line 655,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.consumeRemainderOfLastBlock()",
      "begin_line": 663,
      "end_line": 669,
      "comment": "\n     * This method is invoked once the end of the archive is hit, it\n     * tries to consume the remaining bytes under the assumption that\n     * the tool creating this archive has padded the last block.\n     ",
      "child_ranges": [
        "(line 664,col 9)-(line 664,col 69)",
        "(line 665,col 9)-(line 668,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byte[], int)",
      "begin_line": 680,
      "end_line": 716,
      "comment": "\n     * Checks if the signature matches what is expected for a tar file.\n     *\n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is a tar archive stream, false otherwise\n     ",
      "child_ranges": [
        "(line 681,col 9)-(line 683,col 9)",
        "(line 685,col 9)-(line 692,col 9)",
        "(line 693,col 9)-(line 705,col 9)",
        "(line 707,col 9)-(line 714,col 9)",
        "(line 715,col 9)-(line 715,col 21)"
      ]
    }
  ]
}