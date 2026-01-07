{
  "filepath": "/tmp/Compress-19b/src/main/java/org/apache/commons/compress/archivers/tar/TarBuffer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "// Not public, because only needed by the Tar IO streams\nTarBuffer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 435,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RCDSIZE"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Default record size "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BLKSIZE"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Default block size "
    },
    {
      "type": "field",
      "varNames": [
        "inStream"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " TODO make these final? (would need to change close() method)"
    },
    {
      "type": "field",
      "varNames": [
        "outStream"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blockSize"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordSize"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recsPerBlock"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blockBuffer"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currBlkIdx"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currRecIdx"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.TarBuffer(java.io.InputStream)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Constructor for a TarBuffer on an input stream.\n     * @param inStream the input stream to use\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.TarBuffer(java.io.InputStream, int)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Constructor for a TarBuffer on an input stream.\n     * @param inStream the input stream to use\n     * @param blockSize the block size to use\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.TarBuffer(java.io.InputStream, int, int)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Constructor for a TarBuffer on an input stream.\n     * @param inStream the input stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.TarBuffer(java.io.OutputStream)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Constructor for a TarBuffer on an output stream.\n     * @param outStream the output stream to use\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.TarBuffer(java.io.OutputStream, int)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Constructor for a TarBuffer on an output stream.\n     * @param outStream the output stream to use\n     * @param blockSize the block size to use\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.TarBuffer(java.io.OutputStream, int, int)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Constructor for a TarBuffer on an output stream.\n     * @param outStream the output stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.TarBuffer(java.io.InputStream, java.io.OutputStream, int, int)",
      "begin_line": 115,
      "end_line": 130,
      "comment": "\n     * Private constructor to perform common setup.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 33)",
        "(line 117,col 9)-(line 117,col 35)",
        "(line 118,col 9)-(line 118,col 35)",
        "(line 119,col 9)-(line 119,col 37)",
        "(line 120,col 9)-(line 120,col 63)",
        "(line 121,col 9)-(line 121,col 52)",
        "(line 123,col 9)-(line 129,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.getBlockSize()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Get the TAR Buffer\u0027s block size. Blocks consist of multiple records.\n     * @return the block size\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.getRecordSize()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * Get the TAR Buffer\u0027s record size.\n     * @return the record size\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.isEOFRecord(byte[])",
      "begin_line": 155,
      "end_line": 164,
      "comment": "\n     * Determine if an archive record indicate End of Archive. End of\n     * archive is indicated by a record that consists entirely of null bytes.\n     *\n     * @param record The record data to check.\n     * @return true if the record data is an End of Archive\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.skipRecord()",
      "begin_line": 170,
      "end_line": 180,
      "comment": "\n     * Skip over a record on the input stream.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 173,col 9)",
        "(line 175,col 9)-(line 177,col 9)",
        "(line 179,col 9)-(line 179,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.readRecord()",
      "begin_line": 188,
      "end_line": 209,
      "comment": "\n     * Read a record from the input stream and return the data.\n     *\n     * @return The record data or null if EOF has been hit.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 194,col 9)",
        "(line 196,col 9)-(line 198,col 9)",
        "(line 200,col 9)-(line 200,col 45)",
        "(line 202,col 9)-(line 204,col 37)",
        "(line 206,col 9)-(line 206,col 21)",
        "(line 208,col 9)-(line 208,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.readBlock()",
      "begin_line": 214,
      "end_line": 270,
      "comment": "\n     * @return false if End-Of-File, else true\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 217,col 9)",
        "(line 219,col 9)-(line 219,col 23)",
        "(line 221,col 9)-(line 221,col 23)",
        "(line 222,col 9)-(line 222,col 36)",
        "(line 224,col 9)-(line 265,col 9)",
        "(line 267,col 9)-(line 267,col 21)",
        "(line 269,col 9)-(line 269,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.getCurrentBlockNum()",
      "begin_line": 277,
      "end_line": 279,
      "comment": "\n     * Get the current block number, zero based.\n     *\n     * @return The current zero based block number.\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.getCurrentRecordNum()",
      "begin_line": 287,
      "end_line": 289,
      "comment": "\n     * Get the current record number, within the current block, zero based.\n     * Thus, current offset \u003d (currentBlockNum * recsPerBlk) + currentRecNum.\n     *\n     * @return The current zero based record number.\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.writeRecord(byte[])",
      "begin_line": 297,
      "end_line": 321,
      "comment": "\n     * Write an archive record to the archive.\n     *\n     * @param record The record data to write to the archive.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 303,col 9)",
        "(line 305,col 9)-(line 310,col 9)",
        "(line 312,col 9)-(line 314,col 9)",
        "(line 316,col 9)-(line 318,col 37)",
        "(line 320,col 9)-(line 320,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.writeRecord(byte[], int)",
      "begin_line": 332,
      "end_line": 356,
      "comment": "\n     * Write an archive record to the archive, where the record may be\n     * inside of a larger array buffer. The buffer must be \"offset plus\n     * record size\" long.\n     *\n     * @param buf The buffer containing the record data to write.\n     * @param offset The offset of the record data within buf.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 338,col 9)",
        "(line 340,col 9)-(line 345,col 9)",
        "(line 347,col 9)-(line 349,col 9)",
        "(line 351,col 9)-(line 353,col 37)",
        "(line 355,col 9)-(line 355,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.writeBlock()",
      "begin_line": 361,
      "end_line": 372,
      "comment": "\n     * Write a TarBuffer block to the archive.\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 364,col 9)",
        "(line 366,col 9)-(line 366,col 51)",
        "(line 367,col 9)-(line 367,col 26)",
        "(line 369,col 9)-(line 369,col 23)",
        "(line 370,col 9)-(line 370,col 21)",
        "(line 371,col 9)-(line 371,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.flushBlock()",
      "begin_line": 377,
      "end_line": 385,
      "comment": "\n     * Flush the current data block if it has any data in it.\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 380,col 9)",
        "(line 382,col 9)-(line 384,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.close()",
      "begin_line": 392,
      "end_line": 408,
      "comment": "\n     * Close the TarBuffer. If this is an output buffer, also flush the\n     * current block before closing.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 407,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.tryToConsumeSecondEOFRecord()",
      "begin_line": 420,
      "end_line": 433,
      "comment": "\n     * Tries to read the next record rewinding the stream if it is not a EOF record.\n     *\n     * \u003cp\u003eThis is meant to protect against cases where a tar\n     * implemenation has written only one EOF record when two are\n     * expected.  Actually this won\u0027t help since a non-conforming\n     * implementation likely won\u0027t fill full blocks consisting of - by\n     * default - ten records either so we probably have already read\n     * beyond the archive anyway.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 35)",
        "(line 422,col 9)-(line 422,col 50)",
        "(line 423,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 432,col 9)"
      ]
    }
  ]
}