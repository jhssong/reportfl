{
  "filepath": "/tmp/Compress-3b/src/main/java/org/apache/commons/compress/archivers/tar/TarBuffer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "// Not public, because only needed by the Tar IO streams\nTarBuffer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 414,
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
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.TarBuffer(java.io.InputStream)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Constructor for a TarBuffer on an input stream.\n     * @param inStream the input stream to use\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.TarBuffer(java.io.InputStream, int)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Constructor for a TarBuffer on an input stream.\n     * @param inStream the input stream to use\n     * @param blockSize the block size to use\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.TarBuffer(java.io.InputStream, int, int)",
      "begin_line": 79,
      "end_line": 84,
      "comment": "\n     * Constructor for a TarBuffer on an input stream.\n     * @param inStream the input stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 33)",
        "(line 81,col 9)-(line 81,col 30)",
        "(line 83,col 9)-(line 83,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.TarBuffer(java.io.OutputStream)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Constructor for a TarBuffer on an output stream.\n     * @param outStream the output stream to use\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.TarBuffer(java.io.OutputStream, int)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Constructor for a TarBuffer on an output stream.\n     * @param outStream the output stream to use\n     * @param blockSize the block size to use\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.TarBuffer(java.io.OutputStream, int, int)",
      "begin_line": 109,
      "end_line": 114,
      "comment": "\n     * Constructor for a TarBuffer on an output stream.\n     * @param outStream the output stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 29)",
        "(line 111,col 9)-(line 111,col 35)",
        "(line 113,col 9)-(line 113,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.initialize(int, int)",
      "begin_line": 119,
      "end_line": 132,
      "comment": "\n     * Initialization common to all constructors.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 35)",
        "(line 121,col 9)-(line 121,col 37)",
        "(line 122,col 9)-(line 122,col 63)",
        "(line 123,col 9)-(line 123,col 52)",
        "(line 125,col 9)-(line 131,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.getBlockSize()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * Get the TAR Buffer\u0027s block size. Blocks consist of multiple records.\n     * @return the block size\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.getRecordSize()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * Get the TAR Buffer\u0027s record size.\n     * @return the record size\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.isEOFRecord(byte[])",
      "begin_line": 157,
      "end_line": 165,
      "comment": "\n     * Determine if an archive record indicate End of Archive. End of\n     * archive is indicated by a record that consists entirely of null bytes.\n     *\n     * @param record The record data to check.\n     * @return true if the record data is an End of Archive\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 162,col 9)",
        "(line 164,col 9)-(line 164,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.skipRecord()",
      "begin_line": 171,
      "end_line": 183,
      "comment": "\n     * Skip over a record on the input stream.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 174,col 9)",
        "(line 176,col 9)-(line 180,col 9)",
        "(line 182,col 9)-(line 182,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.readRecord()",
      "begin_line": 191,
      "end_line": 214,
      "comment": "\n     * Read a record from the input stream and return the data.\n     *\n     * @return The record data.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 203,col 9)",
        "(line 205,col 9)-(line 205,col 45)",
        "(line 207,col 9)-(line 209,col 37)",
        "(line 211,col 9)-(line 211,col 21)",
        "(line 213,col 9)-(line 213,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.readBlock()",
      "begin_line": 219,
      "end_line": 275,
      "comment": "\n     * @return false if End-Of-File, else true\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 222,col 9)",
        "(line 224,col 9)-(line 224,col 23)",
        "(line 226,col 9)-(line 226,col 23)",
        "(line 227,col 9)-(line 227,col 36)",
        "(line 229,col 9)-(line 270,col 9)",
        "(line 272,col 9)-(line 272,col 21)",
        "(line 274,col 9)-(line 274,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.getCurrentBlockNum()",
      "begin_line": 282,
      "end_line": 284,
      "comment": "\n     * Get the current block number, zero based.\n     *\n     * @return The current zero based block number.\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.getCurrentRecordNum()",
      "begin_line": 292,
      "end_line": 294,
      "comment": "\n     * Get the current record number, within the current block, zero based.\n     * Thus, current offset \u003d (currentBlockNum * recsPerBlk) + currentRecNum.\n     *\n     * @return The current zero based record number.\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.writeRecord(byte[])",
      "begin_line": 302,
      "end_line": 326,
      "comment": "\n     * Write an archive record to the archive.\n     *\n     * @param record The record data to write to the archive.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 308,col 9)",
        "(line 310,col 9)-(line 315,col 9)",
        "(line 317,col 9)-(line 319,col 9)",
        "(line 321,col 9)-(line 323,col 37)",
        "(line 325,col 9)-(line 325,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.writeRecord(byte[], int)",
      "begin_line": 337,
      "end_line": 361,
      "comment": "\n     * Write an archive record to the archive, where the record may be\n     * inside of a larger array buffer. The buffer must be \"offset plus\n     * record size\" long.\n     *\n     * @param buf The buffer containing the record data to write.\n     * @param offset The offset of the record data within buf.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 343,col 9)",
        "(line 345,col 9)-(line 350,col 9)",
        "(line 352,col 9)-(line 354,col 9)",
        "(line 356,col 9)-(line 358,col 37)",
        "(line 360,col 9)-(line 360,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.writeBlock()",
      "begin_line": 366,
      "end_line": 376,
      "comment": "\n     * Write a TarBuffer block to the archive.\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 369,col 9)",
        "(line 371,col 9)-(line 371,col 51)",
        "(line 372,col 9)-(line 372,col 26)",
        "(line 374,col 9)-(line 374,col 23)",
        "(line 375,col 9)-(line 375,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.flushBlock()",
      "begin_line": 381,
      "end_line": 389,
      "comment": "\n     * Flush the current data block if it has any data in it.\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 384,col 9)",
        "(line 386,col 9)-(line 388,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.close()",
      "begin_line": 396,
      "end_line": 413,
      "comment": "\n     * Close the TarBuffer. If this is an output buffer, also flush the\n     * current block before closing.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 412,col 9)"
      ]
    }
  ]
}