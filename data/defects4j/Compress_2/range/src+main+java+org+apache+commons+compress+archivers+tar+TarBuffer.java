{
  "filepath": "/tmp/Compress-2b/src/main/java/org/apache/commons/compress/archivers/tar/TarBuffer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "// Not public, because only needed by the Tar IO streams\nTarBuffer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 465,
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
      "end_line": 235,
      "comment": "\n     * Read a record from the input stream and return the data.\n     *\n     * @return The record data.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 211,col 9)",
        "(line 213,col 9)-(line 218,col 9)",
        "(line 220,col 9)-(line 224,col 9)",
        "(line 226,col 9)-(line 226,col 45)",
        "(line 228,col 9)-(line 230,col 37)",
        "(line 232,col 9)-(line 232,col 21)",
        "(line 234,col 9)-(line 234,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.readBlock()",
      "begin_line": 240,
      "end_line": 304,
      "comment": "\n     * @return false if End-Of-File, else true\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 243,col 9)",
        "(line 245,col 9)-(line 247,col 9)",
        "(line 249,col 9)-(line 249,col 23)",
        "(line 251,col 9)-(line 251,col 23)",
        "(line 252,col 9)-(line 252,col 36)",
        "(line 254,col 9)-(line 299,col 9)",
        "(line 301,col 9)-(line 301,col 21)",
        "(line 303,col 9)-(line 303,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.getCurrentBlockNum()",
      "begin_line": 311,
      "end_line": 313,
      "comment": "\n     * Get the current block number, zero based.\n     *\n     * @return The current zero based block number.\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.getCurrentRecordNum()",
      "begin_line": 321,
      "end_line": 323,
      "comment": "\n     * Get the current record number, within the current block, zero based.\n     * Thus, current offset \u003d (currentBlockNum * recsPerBlk) + currentRecNum.\n     *\n     * @return The current zero based record number.\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.writeRecord(byte[])",
      "begin_line": 331,
      "end_line": 360,
      "comment": "\n     * Write an archive record to the archive.\n     *\n     * @param record The record data to write to the archive.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 335,col 9)",
        "(line 337,col 9)-(line 342,col 9)",
        "(line 344,col 9)-(line 349,col 9)",
        "(line 351,col 9)-(line 353,col 9)",
        "(line 355,col 9)-(line 357,col 37)",
        "(line 359,col 9)-(line 359,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.writeRecord(byte[], int)",
      "begin_line": 371,
      "end_line": 400,
      "comment": "\n     * Write an archive record to the archive, where the record may be\n     * inside of a larger array buffer. The buffer must be \"offset plus\n     * record size\" long.\n     *\n     * @param buf The buffer containing the record data to write.\n     * @param offset The offset of the record data within buf.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 375,col 9)",
        "(line 377,col 9)-(line 382,col 9)",
        "(line 384,col 9)-(line 389,col 9)",
        "(line 391,col 9)-(line 393,col 9)",
        "(line 395,col 9)-(line 397,col 37)",
        "(line 399,col 9)-(line 399,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.writeBlock()",
      "begin_line": 405,
      "end_line": 419,
      "comment": "\n     * Write a TarBuffer block to the archive.\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 408,col 9)",
        "(line 410,col 9)-(line 412,col 9)",
        "(line 414,col 9)-(line 414,col 51)",
        "(line 415,col 9)-(line 415,col 26)",
        "(line 417,col 9)-(line 417,col 23)",
        "(line 418,col 9)-(line 418,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.flushBlock()",
      "begin_line": 424,
      "end_line": 436,
      "comment": "\n     * Flush the current data block if it has any data in it.\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 427,col 9)",
        "(line 429,col 9)-(line 431,col 9)",
        "(line 433,col 9)-(line 435,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.close()",
      "begin_line": 443,
      "end_line": 464,
      "comment": "\n     * Close the TarBuffer. If this is an output buffer, also flush the\n     * current block before closing.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 446,col 9)",
        "(line 448,col 9)-(line 463,col 9)"
      ]
    }
  ]
}