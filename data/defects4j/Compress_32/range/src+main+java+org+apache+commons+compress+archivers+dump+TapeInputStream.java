{
  "filepath": "/tmp/Compress-32b/src/main/java/org/apache/commons/compress/archivers/dump/TapeInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TapeInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.FilterInputStream"
      ],
      "begin_line": 37,
      "end_line": 353,
      "comment": "\n * Filter stream that mimics a physical tape drive capable of compressing\n * the data stream.\n *\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "blockBuffer"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currBlkIdx"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blockSize"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordSize"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "readOffset"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isCompressed"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bytesRead"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.dump.TapeInputStream.TapeInputStream(java.io.InputStream)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Constructor\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.TapeInputStream.resetBlockSize(int, boolean)",
      "begin_line": 67,
      "end_line": 83,
      "comment": "\n     * Set the DumpArchive Buffer\u0027s block size. We need to sync the block size with the\n     * dump archive\u0027s actual block size since compression is handled at the\n     * block level.\n     *\n     * @param recsPerBlock\n     *            records per block\n     * @param isCompressed\n     *            true if the archive is compressed\n     * @throws IOException\n     *             more than one block has been read\n     * @throws IOException\n     *             there was an error reading additional blocks.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 41)",
        "(line 71,col 9)-(line 71,col 46)",
        "(line 74,col 9)-(line 74,col 39)",
        "(line 77,col 9)-(line 77,col 42)",
        "(line 78,col 9)-(line 78,col 67)",
        "(line 79,col 9)-(line 79,col 67)",
        "(line 81,col 9)-(line 81,col 28)",
        "(line 82,col 9)-(line 82,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.TapeInputStream.available()",
      "begin_line": 88,
      "end_line": 95,
      "comment": "\n     * @see java.io.InputStream#available\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 92,col 9)",
        "(line 94,col 9)-(line 94,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.TapeInputStream.read()",
      "begin_line": 100,
      "end_line": 105,
      "comment": "\n     * @see java.io.InputStream#read()\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 104,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.TapeInputStream.read(byte[], int, int)",
      "begin_line": 115,
      "end_line": 151,
      "comment": "\n     * {@inheritDoc}\n     *\n     * \u003cp\u003ereads the full given length unless EOF is reached.\u003c/p\u003e \n     *\n     * @param len length to read, must be a multiple of the stream\u0027s\n     * record size\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 121,col 9)",
        "(line 123,col 9)-(line 123,col 22)",
        "(line 125,col 9)-(line 148,col 9)",
        "(line 150,col 9)-(line 150,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.TapeInputStream.skip(long)",
      "begin_line": 161,
      "end_line": 197,
      "comment": "\n     * Skip bytes. Same as read but without the arraycopy.\n     *\n     * \u003cp\u003eskips the full given length unless EOF is reached.\u003c/p\u003e \n     *\n     * @param len length to read, must be a multiple of the stream\u0027s\n     * record size\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 167,col 9)",
        "(line 169,col 9)-(line 169,col 23)",
        "(line 171,col 9)-(line 194,col 9)",
        "(line 196,col 9)-(line 196,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.TapeInputStream.close()",
      "begin_line": 204,
      "end_line": 209,
      "comment": "\n     * Close the input stream.\n     *\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 208,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.TapeInputStream.peek()",
      "begin_line": 217,
      "end_line": 230,
      "comment": "\n     * Peek at the next record from the input stream and return the data.\n     *\n     * @return The record data.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 223,col 9)",
        "(line 226,col 9)-(line 226,col 40)",
        "(line 227,col 9)-(line 227,col 66)",
        "(line 229,col 9)-(line 229,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.TapeInputStream.readRecord()",
      "begin_line": 238,
      "end_line": 248,
      "comment": "\n     * Read a record from the input stream and return the data.\n     *\n     * @return The record data.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 45)",
        "(line 243,col 9)-(line 245,col 9)",
        "(line 247,col 9)-(line 247,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.TapeInputStream.readBlock(boolean)",
      "begin_line": 257,
      "end_line": 332,
      "comment": "\n     * Read next block. All decompression is handled here.\n     *\n     * @param decompress if false the buffer will not be decompressed.\n     *        This is an optimization for longer seeks.\n     * @return false if End-Of-File, else true\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 31)",
        "(line 260,col 9)-(line 262,col 9)",
        "(line 264,col 9)-(line 326,col 9)",
        "(line 328,col 9)-(line 328,col 21)",
        "(line 329,col 9)-(line 329,col 23)",
        "(line 331,col 9)-(line 331,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.TapeInputStream.readFully(byte[], int, int)",
      "begin_line": 337,
      "end_line": 345,
      "comment": "\n     * Read buffer\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 55)",
        "(line 340,col 9)-(line 342,col 9)",
        "(line 344,col 9)-(line 344,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.TapeInputStream.getBytesRead()",
      "begin_line": 350,
      "end_line": 352,
      "comment": "\n     * Get number of bytes read.\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 25)"
      ]
    }
  ]
}