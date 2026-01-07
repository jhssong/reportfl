{
  "filepath": "/tmp/Compress-15b/src/main/java/org/apache/commons/compress/archivers/dump/TapeInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TapeInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.FilterInputStream"
      ],
      "begin_line": 36,
      "end_line": 357,
      "comment": "\n * Filter stream that mimics a physical tape drive capable of compressing\n * the data stream.\n *\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "blockBuffer"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currBlkIdx"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blockSize"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordSize"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "readOffset"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isCompressed"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bytesRead"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.dump.TapeInputStream.TapeInputStream(java.io.InputStream)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Constructor\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.TapeInputStream.resetBlockSize(int, boolean)",
      "begin_line": 66,
      "end_line": 82,
      "comment": "\n     * Set the DumpArchive Buffer\u0027s block size. We need to sync the block size with the\n     * dump archive\u0027s actual block size since compression is handled at the\n     * block level.\n     *\n     * @param recsPerBlock\n     *            records per block\n     * @param isCompressed\n     *            true if the archive is compressed\n     * @throws IOException\n     *             more than one block has been read\n     * @throws IOException\n     *             there was an error reading additional blocks.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 41)",
        "(line 70,col 9)-(line 70,col 46)",
        "(line 73,col 9)-(line 73,col 39)",
        "(line 76,col 9)-(line 76,col 42)",
        "(line 77,col 9)-(line 77,col 67)",
        "(line 78,col 9)-(line 78,col 67)",
        "(line 80,col 9)-(line 80,col 28)",
        "(line 81,col 9)-(line 81,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.TapeInputStream.available()",
      "begin_line": 87,
      "end_line": 94,
      "comment": "\n     * @see java.io.InputStream#available\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 91,col 9)",
        "(line 93,col 9)-(line 93,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.TapeInputStream.read()",
      "begin_line": 99,
      "end_line": 104,
      "comment": "\n     * @see java.io.InputStream#read()\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 103,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.TapeInputStream.read(byte[], int, int)",
      "begin_line": 114,
      "end_line": 150,
      "comment": "\n     * {@inheritDoc}\n     *\n     * \u003cp\u003ereads the full given length unless EOF is reached.\u003c/p\u003e \n     *\n     * @param len length to read, must be a multiple of the stream\u0027s\n     * record size\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 120,col 9)",
        "(line 122,col 9)-(line 122,col 22)",
        "(line 124,col 9)-(line 147,col 9)",
        "(line 149,col 9)-(line 149,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.TapeInputStream.skip(long)",
      "begin_line": 160,
      "end_line": 196,
      "comment": "\n     * Skip bytes. Same as read but without the arraycopy.\n     *\n     * \u003cp\u003eskips the full given length unless EOF is reached.\u003c/p\u003e \n     *\n     * @param len length to read, must be a multiple of the stream\u0027s\n     * record size\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 166,col 9)",
        "(line 168,col 9)-(line 168,col 23)",
        "(line 170,col 9)-(line 193,col 9)",
        "(line 195,col 9)-(line 195,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.TapeInputStream.close()",
      "begin_line": 203,
      "end_line": 208,
      "comment": "\n     * Close the input stream.\n     *\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 207,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.TapeInputStream.peek()",
      "begin_line": 216,
      "end_line": 229,
      "comment": "\n     * Peek at the next record from the input stream and return the data.\n     *\n     * @return The record data.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 222,col 9)",
        "(line 225,col 9)-(line 225,col 40)",
        "(line 226,col 9)-(line 226,col 66)",
        "(line 228,col 9)-(line 228,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.TapeInputStream.readRecord()",
      "begin_line": 237,
      "end_line": 245,
      "comment": "\n     * Read a record from the input stream and return the data.\n     *\n     * @return The record data.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 45)",
        "(line 240,col 9)-(line 242,col 9)",
        "(line 244,col 9)-(line 244,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.TapeInputStream.readBlock(boolean)",
      "begin_line": 254,
      "end_line": 329,
      "comment": "\n     * Read next block. All decompression is handled here.\n     *\n     * @param decompress if false the buffer will not be decompressed.\n     *        This is an optimization for longer seeks.\n     * @return false if End-Of-File, else true\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 31)",
        "(line 257,col 9)-(line 259,col 9)",
        "(line 261,col 9)-(line 323,col 9)",
        "(line 325,col 9)-(line 325,col 21)",
        "(line 326,col 9)-(line 326,col 23)",
        "(line 328,col 9)-(line 328,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.TapeInputStream.readFully(byte[], int, int)",
      "begin_line": 334,
      "end_line": 349,
      "comment": "\n     * Read buffer\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 22)",
        "(line 338,col 9)-(line 346,col 9)",
        "(line 348,col 9)-(line 348,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.TapeInputStream.getBytesRead()",
      "begin_line": 354,
      "end_line": 356,
      "comment": "\n     * Get number of bytes read.\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 25)"
      ]
    }
  ]
}