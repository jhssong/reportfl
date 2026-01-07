{
  "filepath": "/tmp/Compress-38b/src/main/java/org/apache/commons/compress/archivers/zip/StreamCompressor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StreamCompressor",
      "is_interface": false,
      "parent_types": [
        "java.io.Closeable"
      ],
      "begin_line": 38,
      "end_line": 310,
      "comment": "\n * Encapsulates a {@link Deflater} and crc calculator, handling multiple types of output streams.\n * Currently {@link java.util.zip.ZipEntry#DEFLATED} and {@link java.util.zip.ZipEntry#STORED} are the only\n * supported compression methods.\n *\n * @since 1.10\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFLATER_BLOCK_SIZE"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Apparently Deflater.setInput gets slowed down a lot on Sun JVMs\n     * when it gets handed a really big buffer.  See\n     * https://issues.apache.org/bugzilla/show_bug.cgi?id\u003d45396\n     *\n     * Using a buffer size of 8 kB proved to be a good compromise\n     "
    },
    {
      "type": "field",
      "varNames": [
        "def"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "writtenToOutputStreamForLastEntry"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourcePayloadLength"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "totalWrittenToOutputStream"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bufferSize"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outputBuffer"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "readerBuf"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.StreamCompressor(java.util.zip.Deflater)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.create(java.io.OutputStream, java.util.zip.Deflater)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Create a stream compressor with the given compression level.\n     *\n     * @param os       The stream to receive output\n     * @param deflater The deflater to use\n     * @return A stream compressor\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.create(java.io.OutputStream)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Create a stream compressor with the default compression level.\n     *\n     * @param os The stream to receive output\n     * @return A stream compressor\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.create(java.io.DataOutput, java.util.zip.Deflater)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Create a stream compressor with the given compression level.\n     *\n     * @param os       The DataOutput to receive output\n     * @param deflater The deflater to use for the compressor\n     * @return A stream compressor\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.create(int, org.apache.commons.compress.parallel.ScatterGatherBackingStore)",
      "begin_line": 104,
      "end_line": 107,
      "comment": "\n     * Create a stream compressor with the given compression level.\n     *\n     * @param compressionLevel The {@link Deflater}  compression level\n     * @param bs               The ScatterGatherBackingStore to receive output\n     * @return A stream compressor\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 71)",
        "(line 106,col 9)-(line 106,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.create(org.apache.commons.compress.parallel.ScatterGatherBackingStore)",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * Create a stream compressor with the default compression level.\n     *\n     * @param bs The ScatterGatherBackingStore to receive output\n     * @return A stream compressor\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.getCrc32()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.getBytesRead()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * Return the number of bytes read from the source stream\n     *\n     * @return The number of bytes read, never negative\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.getBytesWrittenForLastEntry()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * The number of bytes written to the output for the last entry\n     *\n     * @return The number of bytes, never negative\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.getTotalBytesWritten()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * The total number of bytes written to the output for all files\n     *\n     * @return The number of bytes, never negative\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.deflate(java.io.InputStream, int)",
      "begin_line": 165,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 16)",
        "(line 167,col 9)-(line 167,col 19)",
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 174,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.write(byte[], int, int, int)",
      "begin_line": 187,
      "end_line": 197,
      "comment": "\n     * Writes bytes to ZIP entry.\n     *\n     * @param b      the byte array to write\n     * @param offset the start position to write from\n     * @param length the number of bytes to write\n     * @param method the comrpession method to use\n     * @return the number of bytes written to the stream this time\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 63)",
        "(line 189,col 9)-(line 189,col 38)",
        "(line 190,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 38)",
        "(line 196,col 9)-(line 196,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.reset()",
      "begin_line": 200,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 20)",
        "(line 202,col 9)-(line 202,col 20)",
        "(line 203,col 9)-(line 203,col 32)",
        "(line 204,col 9)-(line 204,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.close()",
      "begin_line": 207,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.flushDeflater()",
      "begin_line": 212,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 21)",
        "(line 214,col 9)-(line 216,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.writeDeflated(byte[], int, int)",
      "begin_line": 219,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 221,col 9)-(line 238,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.deflateUntilInputIsNeeded()",
      "begin_line": 241,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 242,col 9)-(line 244,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.deflate()",
      "begin_line": 247,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 74)",
        "(line 249,col 9)-(line 251,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.writeCounted(byte[])",
      "begin_line": 254,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.writeCounted(byte[], int, int)",
      "begin_line": 258,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 39)",
        "(line 260,col 9)-(line 260,col 52)",
        "(line 261,col 9)-(line 261,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.writeOut(byte[], int, int)",
      "begin_line": 264,
      "end_line": 264,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "ScatterGatherBackingStoreCompressor",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.StreamCompressor"
      ],
      "begin_line": 266,
      "end_line": 279,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bs"
      ],
      "begin_line": 267,
      "end_line": 267,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.ScatterGatherBackingStoreCompressor.ScatterGatherBackingStoreCompressor(java.util.zip.Deflater, org.apache.commons.compress.parallel.ScatterGatherBackingStore)",
      "begin_line": 269,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 270,col 13)-(line 270,col 28)",
        "(line 271,col 13)-(line 271,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.ScatterGatherBackingStoreCompressor.writeOut(byte[], int, int)",
      "begin_line": 274,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 277,col 13)-(line 277,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OutputStreamCompressor",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.StreamCompressor"
      ],
      "begin_line": 281,
      "end_line": 294,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "os"
      ],
      "begin_line": 282,
      "end_line": 282,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.OutputStreamCompressor.OutputStreamCompressor(java.util.zip.Deflater, java.io.OutputStream)",
      "begin_line": 284,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 285,col 13)-(line 285,col 28)",
        "(line 286,col 13)-(line 286,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.OutputStreamCompressor.writeOut(byte[], int, int)",
      "begin_line": 289,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 292,col 13)-(line 292,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DataOutputCompressor",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.StreamCompressor"
      ],
      "begin_line": 296,
      "end_line": 309,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "raf"
      ],
      "begin_line": 297,
      "end_line": 297,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.DataOutputCompressor.DataOutputCompressor(java.util.zip.Deflater, java.io.DataOutput)",
      "begin_line": 299,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 300,col 13)-(line 300,col 28)",
        "(line 301,col 13)-(line 301,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.DataOutputCompressor.writeOut(byte[], int, int)",
      "begin_line": 304,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 307,col 13)-(line 307,col 44)"
      ]
    }
  ]
}