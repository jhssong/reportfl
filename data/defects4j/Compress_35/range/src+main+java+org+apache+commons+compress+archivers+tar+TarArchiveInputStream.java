{
  "filepath": "/tmp/Compress-35b/src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 48,
      "end_line": 731,
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
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " the provided encoding (for unit tests)"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 77)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, java.lang.String)",
      "begin_line": 95,
      "end_line": 98,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 97,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, int)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param blockSize the block size to use\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, int, java.lang.String)",
      "begin_line": 116,
      "end_line": 119,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param blockSize the block size to use\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, int, int)",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, int, int, java.lang.String)",
      "begin_line": 139,
      "end_line": 147,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 21)",
        "(line 142,col 9)-(line 142,col 31)",
        "(line 143,col 9)-(line 143,col 33)",
        "(line 144,col 9)-(line 144,col 70)",
        "(line 145,col 9)-(line 145,col 37)",
        "(line 146,col 9)-(line 146,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.close()",
      "begin_line": 153,
      "end_line": 156,
      "comment": "\n     * Closes this stream. Calls the TarBuffer\u0027s close() method.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecordSize()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * Get the record size being used by this stream\u0027s buffer.\n     *\n     * @return The TarBuffer record size.\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.available()",
      "begin_line": 179,
      "end_line": 188,
      "comment": "\n     * Get the available data that can be read from the current\n     * entry in the archive. This does not indicate how much data\n     * is left in the entire archive, only in the current entry.\n     * This value is determined from the entry\u0027s size header field\n     * and the amount of data already read from the current entry.\n     * Integer.MAX_VALUE is returned in case more than Integer.MAX_VALUE\n     * bytes are left in the current entry in the archive.\n     *\n     * @return The number of available bytes for the current entry.\n     * @throws IOException for signature\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.skip(long)",
      "begin_line": 207,
      "end_line": 218,
      "comment": "\n     * Skips over and discards \u003ccode\u003en\u003c/code\u003e bytes of data from this input\n     * stream. The \u003ccode\u003eskip\u003c/code\u003e method may, for a variety of reasons, end\n     * up skipping over some smaller number of bytes, possibly \u003ccode\u003e0\u003c/code\u003e.\n     * This may result from any of a number of conditions; reaching end of file\n     * or end of entry before \u003ccode\u003en\u003c/code\u003e bytes have been skipped; are only\n     * two possibilities. The actual number of bytes skipped is returned. If\n     * \u003ccode\u003en\u003c/code\u003e is negative, no bytes are skipped.\n     * \n     * \n     * @param n\n     *            the number of bytes to be skipped.\n     * @return the actual number of bytes skipped.\n     * @exception IOException\n     *                if some other I/O error occurs.\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 211,col 9)",
        "(line 213,col 9)-(line 213,col 55)",
        "(line 214,col 9)-(line 214,col 61)",
        "(line 215,col 9)-(line 215,col 23)",
        "(line 216,col 9)-(line 216,col 31)",
        "(line 217,col 9)-(line 217,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.markSupported()",
      "begin_line": 225,
      "end_line": 228,
      "comment": "\n     * Since we do not support marking just yet, we return false.\n     *\n     * @return False.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.mark(int)",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\n     * Since we do not support marking just yet, we do nothing.\n     *\n     * @param markLimit The limit to mark.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.reset()",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\n     * Since we do not support marking just yet, we do nothing.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry()",
      "begin_line": 259,
      "end_line": 328,
      "comment": "\n     * Get the next entry in this tar archive. This will skip\n     * over any remaining data in the current entry, if there\n     * is one, and place the input stream at the header of the\n     * next entry, and read the header and instantiate a new\n     * TarEntry from the header bytes and return that entry.\n     * If there are no more entries in the archive, null will\n     * be returned to indicate that the end of the archive has\n     * been reached.\n     *\n     * @return The next TarEntry in the archive, or null.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 262,col 9)",
        "(line 264,col 9)-(line 270,col 9)",
        "(line 272,col 9)-(line 272,col 39)",
        "(line 274,col 9)-(line 278,col 9)",
        "(line 280,col 9)-(line 286,col 9)",
        "(line 288,col 9)-(line 288,col 24)",
        "(line 289,col 9)-(line 289,col 40)",
        "(line 291,col 9)-(line 300,col 9)",
        "(line 302,col 9)-(line 311,col 9)",
        "(line 313,col 9)-(line 315,col 9)",
        "(line 317,col 9)-(line 319,col 9)",
        "(line 325,col 9)-(line 325,col 40)",
        "(line 327,col 9)-(line 327,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.skipRecordPadding()",
      "begin_line": 334,
      "end_line": 341,
      "comment": "\n     * The last record block should be written at the full size, so skip any\n     * additional space used to fill a record after an entry\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 340,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getLongNameData()",
      "begin_line": 349,
      "end_line": 374,
      "comment": "\n     * Get the next entry in this tar archive as longname data.\n     *\n     * @return The next entry in the archive as longname data, or null.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 69)",
        "(line 352,col 9)-(line 352,col 23)",
        "(line 353,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 356,col 23)",
        "(line 357,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 362,col 53)",
        "(line 364,col 9)-(line 364,col 37)",
        "(line 365,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 373,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord()",
      "begin_line": 390,
      "end_line": 399,
      "comment": "\n     * Get the next record in this tar archive. This will skip\n     * over any remaining data in the current entry, if there\n     * is one, and place the input stream at the header of the\n     * next entry.\n     *\n     * \u003cp\u003eIf there are no more entries in the archive, null will be\n     * returned to indicate that the end of the archive has been\n     * reached.  At the same time the {@code hasHitEOF} marker will be\n     * set to true.\u003c/p\u003e\n     *\n     * @return The next header in the archive, or null.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 40)",
        "(line 392,col 9)-(line 392,col 43)",
        "(line 393,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 398,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isEOFRecord(byte[])",
      "begin_line": 408,
      "end_line": 410,
      "comment": "\n     * Determine if an archive record indicate End of Archive. End of\n     * archive is indicated by a record that consists entirely of null bytes.\n     *\n     * @param record The record data to check.\n     * @return true if the record data is an End of Archive\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readRecord()",
      "begin_line": 418,
      "end_line": 429,
      "comment": "\n     * Read a record from the input stream and return the data.\n     *\n     * @return The record data or null if EOF has been hit.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 45)",
        "(line 422,col 9)-(line 422,col 52)",
        "(line 423,col 9)-(line 423,col 23)",
        "(line 424,col 9)-(line 426,col 9)",
        "(line 428,col 9)-(line 428,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.paxHeaders()",
      "begin_line": 431,
      "end_line": 435,
      "comment": "",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 60)",
        "(line 433,col 9)-(line 433,col 23)",
        "(line 434,col 9)-(line 434,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.parsePaxHeaders(java.io.InputStream)",
      "begin_line": 437,
      "end_line": 482,
      "comment": "",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 68)",
        "(line 440,col 9)-(line 480,col 9)",
        "(line 481,col 9)-(line 481,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.applyPaxHeadersToCurrentEntry(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 484,
      "end_line": 521,
      "comment": "",
      "child_ranges": [
        "(line 496,col 9)-(line 520,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readGNUSparse()",
      "begin_line": 531,
      "end_line": 550,
      "comment": "\n     * Adds the sparse chunks from the current entry to the sparse chunks,\n     * including any additional sparse entries following the current entry.\n     *\n     * @throws IOException on error\n     *\n     * @todo Sparse files get not yet really processed.\n     ",
      "child_ranges": [
        "(line 536,col 9)-(line 549,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isDirectory()",
      "begin_line": 552,
      "end_line": 554,
      "comment": "",
      "child_ranges": [
        "(line 553,col 9)-(line 553,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry()",
      "begin_line": 563,
      "end_line": 566,
      "comment": "\n     * Returns the next Archive Entry in this Stream.\n     *\n     * @return the next entry,\n     *         or {@code null} if there are no more entries\n     * @throws IOException if the next entry could not be read\n     ",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.tryToConsumeSecondEOFRecord()",
      "begin_line": 578,
      "end_line": 592,
      "comment": "\n     * Tries to read the next record rewinding the stream if it is not a EOF record.\n     *\n     * \u003cp\u003eThis is meant to protect against cases where a tar\n     * implementation has written only one EOF record when two are\n     * expected.  Actually this won\u0027t help since a non-conforming\n     * implementation likely won\u0027t fill full blocks consisting of - by\n     * default - ten records either so we probably have already read\n     * beyond the archive anyway.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 35)",
        "(line 580,col 9)-(line 580,col 44)",
        "(line 581,col 9)-(line 583,col 9)",
        "(line 584,col 9)-(line 591,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read(byte[], int, int)",
      "begin_line": 607,
      "end_line": 634,
      "comment": "\n     * Reads bytes from the current tar archive entry.\n     *\n     * This method is aware of the boundaries of the current\n     * entry in the archive and will deal with them as if they\n     * were this stream\u0027s start and EOF.\n     *\n     * @param buf The buffer into which to place bytes read.\n     * @param offset The offset at which to place bytes read.\n     * @param numToRead The number of bytes to read.\n     * @return The number of bytes read, or -1 at EOF.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 609,col 6)-(line 609,col 23)",
        "(line 611,col 9)-(line 613,col 9)",
        "(line 615,col 9)-(line 617,col 9)",
        "(line 619,col 9)-(line 619,col 53)",
        "(line 621,col 9)-(line 621,col 52)",
        "(line 623,col 9)-(line 631,col 9)",
        "(line 633,col 9)-(line 633,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 641,
      "end_line": 648,
      "comment": "\n     * Whether this class is able to read the given entry.\n     *\n     * \u003cp\u003eMay return false if the current entry is a sparse file.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 646,col 9)",
        "(line 647,col 9)-(line 647,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getCurrentEntry()",
      "begin_line": 655,
      "end_line": 657,
      "comment": "\n     * Get the current TAR Archive Entry that this input stream is processing\n     * \n     * @return The current Archive Entry\n     ",
      "child_ranges": [
        "(line 656,col 9)-(line 656,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.setCurrentEntry(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 659,
      "end_line": 661,
      "comment": "",
      "child_ranges": [
        "(line 660,col 9)-(line 660,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isAtEOF()",
      "begin_line": 663,
      "end_line": 665,
      "comment": "",
      "child_ranges": [
        "(line 664,col 9)-(line 664,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.setAtEOF(boolean)",
      "begin_line": 667,
      "end_line": 669,
      "comment": "",
      "child_ranges": [
        "(line 668,col 9)-(line 668,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.consumeRemainderOfLastBlock()",
      "begin_line": 676,
      "end_line": 682,
      "comment": "\n     * This method is invoked once the end of the archive is hit, it\n     * tries to consume the remaining bytes under the assumption that\n     * the tool creating this archive has padded the last block.\n     ",
      "child_ranges": [
        "(line 677,col 9)-(line 677,col 63)",
        "(line 678,col 9)-(line 681,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byte[], int)",
      "begin_line": 693,
      "end_line": 729,
      "comment": "\n     * Checks if the signature matches what is expected for a tar file.\n     *\n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is a tar archive stream, false otherwise\n     ",
      "child_ranges": [
        "(line 694,col 9)-(line 696,col 9)",
        "(line 698,col 9)-(line 705,col 9)",
        "(line 706,col 9)-(line 718,col 9)",
        "(line 720,col 9)-(line 727,col 9)",
        "(line 728,col 9)-(line 728,col 21)"
      ]
    }
  ]
}