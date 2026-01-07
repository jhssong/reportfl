{
  "filepath": "/tmp/Compress-18b/src/main/java/org/apache/commons/compress/archivers/tar/TarBuffer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "// Not public, because only needed by the Tar IO streams\nTarBuffer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 408,
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
      "end_line": 163,
      "comment": "\n     * Determine if an archive record indicate End of Archive. End of\n     * archive is indicated by a record that consists entirely of null bytes.\n     *\n     * @param record The record data to check.\n     * @return true if the record data is an End of Archive\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 160,col 9)",
        "(line 162,col 9)-(line 162,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.skipRecord()",
      "begin_line": 169,
      "end_line": 179,
      "comment": "\n     * Skip over a record on the input stream.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 172,col 9)",
        "(line 174,col 9)-(line 176,col 9)",
        "(line 178,col 9)-(line 178,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.readRecord()",
      "begin_line": 187,
      "end_line": 208,
      "comment": "\n     * Read a record from the input stream and return the data.\n     *\n     * @return The record data.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 193,col 9)",
        "(line 195,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 199,col 45)",
        "(line 201,col 9)-(line 203,col 37)",
        "(line 205,col 9)-(line 205,col 21)",
        "(line 207,col 9)-(line 207,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.readBlock()",
      "begin_line": 213,
      "end_line": 269,
      "comment": "\n     * @return false if End-Of-File, else true\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 216,col 9)",
        "(line 218,col 9)-(line 218,col 23)",
        "(line 220,col 9)-(line 220,col 23)",
        "(line 221,col 9)-(line 221,col 36)",
        "(line 223,col 9)-(line 264,col 9)",
        "(line 266,col 9)-(line 266,col 21)",
        "(line 268,col 9)-(line 268,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.getCurrentBlockNum()",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\n     * Get the current block number, zero based.\n     *\n     * @return The current zero based block number.\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.getCurrentRecordNum()",
      "begin_line": 286,
      "end_line": 288,
      "comment": "\n     * Get the current record number, within the current block, zero based.\n     * Thus, current offset \u003d (currentBlockNum * recsPerBlk) + currentRecNum.\n     *\n     * @return The current zero based record number.\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.writeRecord(byte[])",
      "begin_line": 296,
      "end_line": 320,
      "comment": "\n     * Write an archive record to the archive.\n     *\n     * @param record The record data to write to the archive.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 302,col 9)",
        "(line 304,col 9)-(line 309,col 9)",
        "(line 311,col 9)-(line 313,col 9)",
        "(line 315,col 9)-(line 317,col 37)",
        "(line 319,col 9)-(line 319,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.writeRecord(byte[], int)",
      "begin_line": 331,
      "end_line": 355,
      "comment": "\n     * Write an archive record to the archive, where the record may be\n     * inside of a larger array buffer. The buffer must be \"offset plus\n     * record size\" long.\n     *\n     * @param buf The buffer containing the record data to write.\n     * @param offset The offset of the record data within buf.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 337,col 9)",
        "(line 339,col 9)-(line 344,col 9)",
        "(line 346,col 9)-(line 348,col 9)",
        "(line 350,col 9)-(line 352,col 37)",
        "(line 354,col 9)-(line 354,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.writeBlock()",
      "begin_line": 360,
      "end_line": 371,
      "comment": "\n     * Write a TarBuffer block to the archive.\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 363,col 9)",
        "(line 365,col 9)-(line 365,col 51)",
        "(line 366,col 9)-(line 366,col 26)",
        "(line 368,col 9)-(line 368,col 23)",
        "(line 369,col 9)-(line 369,col 21)",
        "(line 370,col 9)-(line 370,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.flushBlock()",
      "begin_line": 376,
      "end_line": 384,
      "comment": "\n     * Flush the current data block if it has any data in it.\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 379,col 9)",
        "(line 381,col 9)-(line 383,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarBuffer.close()",
      "begin_line": 391,
      "end_line": 407,
      "comment": "\n     * Close the TarBuffer. If this is an output buffer, also flush the\n     * current block before closing.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 406,col 9)"
      ]
    }
  ]
}