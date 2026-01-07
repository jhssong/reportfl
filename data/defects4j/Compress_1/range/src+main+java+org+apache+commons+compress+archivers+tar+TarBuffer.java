{
  "filepath": "/tmp/Compress-1b/src/main/java/org/apache/commons/compress/archivers/tar/TarBuffer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarBuffer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 456,
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
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outStream"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blockBuffer"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currBlkIdx"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currRecIdx"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blockSize"
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
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recsPerBlock"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "debug"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.TarBuffer(java.io.InputStream)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Constructor for a TarBuffer on an input stream.\n     * @param inStream the input stream to use\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.TarBuffer(java.io.InputStream, int)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Constructor for a TarBuffer on an input stream.\n     * @param inStream the input stream to use\n     * @param blockSize the block size to use\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.TarBuffer(java.io.InputStream, int, int)",
      "begin_line": 80,
      "end_line": 85,
      "comment": "\n     * Constructor for a TarBuffer on an input stream.\n     * @param inStream the input stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 33)",
        "(line 82,col 9)-(line 82,col 30)",
        "(line 84,col 9)-(line 84,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.TarBuffer(java.io.OutputStream)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Constructor for a TarBuffer on an output stream.\n     * @param outStream the output stream to use\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.TarBuffer(java.io.OutputStream, int)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Constructor for a TarBuffer on an output stream.\n     * @param outStream the output stream to use\n     * @param blockSize the block size to use\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.TarBuffer(java.io.OutputStream, int, int)",
      "begin_line": 110,
      "end_line": 115,
      "comment": "\n     * Constructor for a TarBuffer on an output stream.\n     * @param outStream the output stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 29)",
        "(line 112,col 9)-(line 112,col 35)",
        "(line 114,col 9)-(line 114,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.initialize(int, int)",
      "begin_line": 120,
      "end_line": 134,
      "comment": "\n     * Initialization common to all constructors.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 27)",
        "(line 122,col 9)-(line 122,col 35)",
        "(line 123,col 9)-(line 123,col 37)",
        "(line 124,col 9)-(line 124,col 63)",
        "(line 125,col 9)-(line 125,col 52)",
        "(line 127,col 9)-(line 133,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.getBlockSize()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * Get the TAR Buffer\u0027s block size. Blocks consist of multiple records.\n     * @return the block size\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.getRecordSize()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * Get the TAR Buffer\u0027s record size.\n     * @return the record size\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.setDebug(boolean)",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * Set the debugging flag for the buffer.\n     *\n     * @param debug If true, print debugging output.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.isEOFRecord(byte[])",
      "begin_line": 168,
      "end_line": 176,
      "comment": "\n     * Determine if an archive record indicate End of Archive. End of\n     * archive is indicated by a record that consists entirely of null bytes.\n     *\n     * @param record The record data to check.\n     * @return true if the record data is an End of Archive\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 173,col 9)",
        "(line 175,col 9)-(line 175,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.skipRecord()",
      "begin_line": 182,
      "end_line": 199,
      "comment": "\n     * Skip over a record on the input stream.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 186,col 9)",
        "(line 188,col 9)-(line 190,col 9)",
        "(line 192,col 9)-(line 196,col 9)",
        "(line 198,col 9)-(line 198,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.readRecord()",
      "begin_line": 207,
      "end_line": 232,
      "comment": "\n     * Read a record from the input stream and return the data.\n     *\n     * @return The record data.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 211,col 9)",
        "(line 213,col 9)-(line 215,col 9)",
        "(line 217,col 9)-(line 221,col 9)",
        "(line 223,col 9)-(line 223,col 45)",
        "(line 225,col 9)-(line 227,col 37)",
        "(line 229,col 9)-(line 229,col 21)",
        "(line 231,col 9)-(line 231,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.readBlock()",
      "begin_line": 237,
      "end_line": 301,
      "comment": "\n     * @return false if End-Of-File, else true\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 240,col 9)",
        "(line 242,col 9)-(line 244,col 9)",
        "(line 246,col 9)-(line 246,col 23)",
        "(line 248,col 9)-(line 248,col 23)",
        "(line 249,col 9)-(line 249,col 36)",
        "(line 251,col 9)-(line 296,col 9)",
        "(line 298,col 9)-(line 298,col 21)",
        "(line 300,col 9)-(line 300,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.getCurrentBlockNum()",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\n     * Get the current block number, zero based.\n     *\n     * @return The current zero based block number.\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.getCurrentRecordNum()",
      "begin_line": 318,
      "end_line": 320,
      "comment": "\n     * Get the current record number, within the current block, zero based.\n     * Thus, current offset \u003d (currentBlockNum * recsPerBlk) + currentRecNum.\n     *\n     * @return The current zero based record number.\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.writeRecord(byte[])",
      "begin_line": 328,
      "end_line": 354,
      "comment": "\n     * Write an archive record to the archive.\n     *\n     * @param record The record data to write to the archive.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 332,col 9)",
        "(line 334,col 9)-(line 336,col 9)",
        "(line 338,col 9)-(line 343,col 9)",
        "(line 345,col 9)-(line 347,col 9)",
        "(line 349,col 9)-(line 351,col 37)",
        "(line 353,col 9)-(line 353,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.writeRecord(byte[], int)",
      "begin_line": 365,
      "end_line": 391,
      "comment": "\n     * Write an archive record to the archive, where the record may be\n     * inside of a larger array buffer. The buffer must be \"offset plus\n     * record size\" long.\n     *\n     * @param buf The buffer containing the record data to write.\n     * @param offset The offset of the record data within buf.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 369,col 9)",
        "(line 371,col 9)-(line 373,col 9)",
        "(line 375,col 9)-(line 380,col 9)",
        "(line 382,col 9)-(line 384,col 9)",
        "(line 386,col 9)-(line 388,col 37)",
        "(line 390,col 9)-(line 390,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.writeBlock()",
      "begin_line": 396,
      "end_line": 410,
      "comment": "\n     * Write a TarBuffer block to the archive.\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 399,col 9)",
        "(line 401,col 9)-(line 403,col 9)",
        "(line 405,col 9)-(line 405,col 51)",
        "(line 406,col 9)-(line 406,col 26)",
        "(line 408,col 9)-(line 408,col 23)",
        "(line 409,col 9)-(line 409,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.flushBlock()",
      "begin_line": 415,
      "end_line": 427,
      "comment": "\n     * Flush the current data block if it has any data in it.\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 418,col 9)",
        "(line 420,col 9)-(line 422,col 9)",
        "(line 424,col 9)-(line 426,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.close()",
      "begin_line": 434,
      "end_line": 455,
      "comment": "\n     * Close the TarBuffer. If this is an output buffer, also flush the\n     * current block before closing.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 437,col 9)",
        "(line 439,col 9)-(line 454,col 9)"
      ]
    }
  ]
}