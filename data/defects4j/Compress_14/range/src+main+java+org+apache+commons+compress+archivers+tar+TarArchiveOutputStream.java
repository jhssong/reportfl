{
  "filepath": "/tmp/Compress-14b/src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveOutputStream"
      ],
      "begin_line": 38,
      "end_line": 453,
      "comment": "\n * The TarOutputStream writes a UNIX tar archive as an OutputStream.\n * Methods are provided to put entries, and then write their contents\n * by writing to this stream using write().\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "LONGFILE_ERROR"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Fail if a long file name is required in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "LONGFILE_TRUNCATE"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Long paths will be truncated in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "LONGFILE_GNU"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " GNU tar extensions are used to store long file names in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "LONGFILE_POSIX"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " POSIX/PAX extensions are used to store long file names in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "BIGFILE_ERROR"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Fail if a big file (\u0026gt; 8GiB) is required in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "BIGFILE_STAR"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " star/GNU tar/BSD tar extensions are used to store big file sizes in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "BIGFILE_POSIX"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " POSIX/PAX extensions are used to store big file sizes in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "currSize"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currName"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currBytes"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordBuf"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assemLen"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assemBuf"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "buffer"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "longFileMode"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bigFileMode"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "haveUnclosedEntry"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Indicates if putArchiveEntry has been called without closeArchiveEntry "
    },
    {
      "type": "field",
      "varNames": [
        "finished"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " indicates if this archive is finished "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, int)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     * @param blockSize the block size to use\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, int, int)",
      "begin_line": 103,
      "end_line": 110,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 43)",
        "(line 106,col 9)-(line 106,col 64)",
        "(line 107,col 9)-(line 107,col 26)",
        "(line 108,col 9)-(line 108,col 45)",
        "(line 109,col 9)-(line 109,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.setLongFileMode(int)",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * Set the long file mode.\n     * This can be LONGFILE_ERROR(0), LONGFILE_TRUNCATE(1) or LONGFILE_GNU(2).\n     * This specifies the treatment of long file names (names \u003e\u003d TarConstants.NAMELEN).\n     * Default is LONGFILE_ERROR.\n     * @param longFileMode the mode to use\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.setBigFileMode(int)",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * Set the big file mode.\n     * This can be BIGFILE_ERROR(0), BIGFILE_POSIX(1) or BIGFILE_STAR(2).\n     * This specifies the treatment of big files (sizes \u0026gt; TarConstants.MAXSIZE).\n     * Default is BIGFILE_ERROR.\n     * @param bigFileMode the mode to use\n     * @since Apache Commons Compress 1.4\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getCount()",
      "begin_line": 136,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getBytesWritten()",
      "begin_line": 142,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish()",
      "begin_line": 156,
      "end_line": 169,
      "comment": "\n     * Ends the TAR archive without closing the underlying OutputStream.\n     * \n     * An archive consists of a series of file entries terminated by an\n     * end-of-archive entry, which consists of two 512 blocks of zero bytes. \n     * POSIX.1 requires two EOF records, like some other implementations.\n     * \n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 160,col 9)",
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 25)",
        "(line 166,col 9)-(line 166,col 25)",
        "(line 167,col 9)-(line 167,col 28)",
        "(line 168,col 9)-(line 168,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close()",
      "begin_line": 175,
      "end_line": 186,
      "comment": "\n     * Closes the underlying OutputStream.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 179,col 9)",
        "(line 181,col 9)-(line 185,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getRecordSize()",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\n     * Get the record size being used by this stream\u0027s TarBuffer.\n     *\n     * @return The TarBuffer record size.\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 210,
      "end_line": 266,
      "comment": "\n     * Put an entry on the output stream. This writes the entry\u0027s\n     * header record and positions the output stream for writing\n     * the contents of the entry. Once this method is called, the\n     * stream is ready for calls to write() to write the entry\u0027s\n     * contents. Once the contents are written, closeArchiveEntry()\n     * \u003cB\u003eMUST\u003c/B\u003e be called to ensure that all buffered data\n     * is completely written to the output stream.\n     *\n     * @param archiveEntry The TarEntry to be written to the archive.\n     * @throws IOException on error\n     * @throws ClassCastException if archiveEntry is not an instance of TarArchiveEntry\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 63)",
        "(line 216,col 9)-(line 216,col 71)",
        "(line 217,col 9)-(line 238,col 9)",
        "(line 240,col 9)-(line 248,col 9)",
        "(line 250,col 9)-(line 252,col 9)",
        "(line 254,col 9)-(line 254,col 71)",
        "(line 255,col 9)-(line 255,col 38)",
        "(line 257,col 9)-(line 257,col 22)",
        "(line 259,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 264,col 35)",
        "(line 265,col 9)-(line 265,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 278,
      "end_line": 304,
      "comment": "\n     * Close an entry. This method MUST be called for all file\n     * entries that contain data. The reason is that we must\n     * buffer data written to the stream in order to satisfy\n     * the buffer\u0027s record based writes. Thus, there may be\n     * data fragments still being assembled that must be written\n     * to the output stream before this entry is closed and the\n     * next entry written.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 285,col 9)",
        "(line 286,col 9)-(line 295,col 9)",
        "(line 297,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 303,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 320,
      "end_line": 384,
      "comment": "\n     * Writes bytes to the current tar archive entry. This method\n     * is aware of the current entry and will throw an exception if\n     * you attempt to write bytes past the length specified for the\n     * current entry. The method is also (painfully) aware of the\n     * record buffering required by TarBuffer, and manages buffers\n     * that are not a multiple of recordsize in length, including\n     * assembling records from small buffers.\n     *\n     * @param wBuf The buffer to write to the archive.\n     * @param wOffset The offset in the buffer from which to get bytes.\n     * @param numToWrite The number of bytes to write.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 335,col 9)",
        "(line 337,col 9)-(line 359,col 9)",
        "(line 366,col 9)-(line 383,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders(java.lang.String, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 390,
      "end_line": 425,
      "comment": "\n     * Writes a PAX extended header with the given map as contents.\n     * @since Apache Commons Compress 1.4\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 52)",
        "(line 393,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 397,col 90)",
        "(line 399,col 9)-(line 399,col 44)",
        "(line 400,col 9)-(line 419,col 9)",
        "(line 420,col 9)-(line 420,col 53)",
        "(line 421,col 9)-(line 421,col 33)",
        "(line 422,col 9)-(line 422,col 29)",
        "(line 423,col 9)-(line 423,col 20)",
        "(line 424,col 9)-(line 424,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord()",
      "begin_line": 431,
      "end_line": 437,
      "comment": "\n     * Write an EOF (end of archive) record to the tar archive.\n     * An EOF record consists of a record of all zeros.\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 434,col 9)",
        "(line 436,col 9)-(line 436,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.flush()",
      "begin_line": 439,
      "end_line": 442,
      "comment": "",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 445,
      "end_line": 452,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 448,col 9)-(line 450,col 9)",
        "(line 451,col 9)-(line 451,col 57)"
      ]
    }
  ]
}