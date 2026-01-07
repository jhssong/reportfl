{
  "filepath": "/tmp/Compress-31b/src/main/java/org/apache/commons/compress/archivers/zip/StreamCompressor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StreamCompressor",
      "is_interface": false,
      "parent_types": [
        "java.io.Closeable"
      ],
      "begin_line": 37,
      "end_line": 305,
      "comment": "\n * Encapsulates a {@link Deflater} and crc calculator, handling multiple types of output streams.\n * Currently {@link java.util.zip.ZipEntry#DEFLATED} and {@link java.util.zip.ZipEntry#STORED} are the only\n * supported compression methods.\n *\n * @since 1.10\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFLATER_BLOCK_SIZE"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * Apparently Deflater.setInput gets slowed down a lot on Sun JVMs\n     * when it gets handed a really big buffer.  See\n     * https://issues.apache.org/bugzilla/show_bug.cgi?id\u003d45396\n     *\n     * Using a buffer size of 8 kB proved to be a good compromise\n     "
    },
    {
      "type": "field",
      "varNames": [
        "def"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "writtenToOutputStreamForLastEntry"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourcePayloadLength"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "totalWrittenToOutputStream"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bufferSize"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outputBuffer"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "readerBuf"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.StreamCompressor(java.util.zip.Deflater)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.create(java.io.OutputStream, java.util.zip.Deflater)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Create a stream compressor with the given compression level.\n     *\n     * @param os       The stream to receive output\n     * @param deflater The deflater to use\n     * @return A stream compressor\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.create(java.io.OutputStream)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Create a stream compressor with the default compression level.\n     *\n     * @param os The stream to receive output\n     * @return A stream compressor\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.create(java.io.DataOutput, java.util.zip.Deflater)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Create a stream compressor with the given compression level.\n     *\n     * @param os       The DataOutput to receive output\n     * @param deflater The deflater to use for the compressor\n     * @return A stream compressor\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.create(int, org.apache.commons.compress.parallel.ScatterGatherBackingStore)",
      "begin_line": 103,
      "end_line": 106,
      "comment": "\n     * Create a stream compressor with the given compression level.\n     *\n     * @param compressionLevel The {@link Deflater}  compression level\n     * @param bs               The ScatterGatherBackingStore to receive output\n     * @return A stream compressor\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 71)",
        "(line 105,col 9)-(line 105,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.create(org.apache.commons.compress.parallel.ScatterGatherBackingStore)",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Create a stream compressor with the default compression level.\n     *\n     * @param bs The ScatterGatherBackingStore to receive output\n     * @return A stream compressor\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.getCrc32()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.getBytesRead()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * Return the number of bytes read from the source stream\n     *\n     * @return The number of bytes read, never negative\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.getBytesWrittenForLastEntry()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * The number of bytes written to the output for the last entry\n     *\n     * @return The number of bytes, never negative\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.getTotalBytesWritten()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * The total number of bytes written to the output for all files\n     *\n     * @return The number of bytes, never negative\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.deflate(java.io.InputStream, int)",
      "begin_line": 164,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 16)",
        "(line 166,col 9)-(line 166,col 19)",
        "(line 168,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 173,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.write(byte[], int, int, int)",
      "begin_line": 186,
      "end_line": 196,
      "comment": "\n     * Writes bytes to ZIP entry.\n     *\n     * @param b      the byte array to write\n     * @param offset the start position to write from\n     * @param length the number of bytes to write\n     * @param method the comrpession method to use\n     * @return the number of bytes written to the stream this time\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 57)",
        "(line 188,col 9)-(line 188,col 38)",
        "(line 189,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 38)",
        "(line 195,col 9)-(line 195,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.reset()",
      "begin_line": 199,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 20)",
        "(line 201,col 9)-(line 201,col 20)",
        "(line 202,col 9)-(line 202,col 32)",
        "(line 203,col 9)-(line 203,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.close()",
      "begin_line": 206,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.flushDeflater()",
      "begin_line": 210,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 21)",
        "(line 212,col 9)-(line 214,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.writeDeflated(byte[], int, int)",
      "begin_line": 217,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 219,col 9)-(line 236,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.deflateUntilInputIsNeeded()",
      "begin_line": 239,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 240,col 9)-(line 242,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.deflate()",
      "begin_line": 245,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 68)",
        "(line 247,col 9)-(line 249,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.writeCounted(byte[])",
      "begin_line": 252,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.writeCounted(byte[], int, int)",
      "begin_line": 256,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 39)",
        "(line 258,col 9)-(line 258,col 52)",
        "(line 259,col 9)-(line 259,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.writeOut(byte[], int, int)",
      "begin_line": 262,
      "end_line": 262,
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
      "begin_line": 264,
      "end_line": 276,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bs"
      ],
      "begin_line": 265,
      "end_line": 265,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.ScatterGatherBackingStoreCompressor.ScatterGatherBackingStoreCompressor(java.util.zip.Deflater, org.apache.commons.compress.parallel.ScatterGatherBackingStore)",
      "begin_line": 267,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 268,col 13)-(line 268,col 28)",
        "(line 269,col 13)-(line 269,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.ScatterGatherBackingStoreCompressor.writeOut(byte[], int, int)",
      "begin_line": 272,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 274,col 13)-(line 274,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OutputStreamCompressor",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.StreamCompressor"
      ],
      "begin_line": 278,
      "end_line": 290,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "os"
      ],
      "begin_line": 279,
      "end_line": 279,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.OutputStreamCompressor.OutputStreamCompressor(java.util.zip.Deflater, java.io.OutputStream)",
      "begin_line": 281,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 282,col 13)-(line 282,col 28)",
        "(line 283,col 13)-(line 283,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.OutputStreamCompressor.writeOut(byte[], int, int)",
      "begin_line": 286,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 288,col 13)-(line 288,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DataOutputCompressor",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.StreamCompressor"
      ],
      "begin_line": 292,
      "end_line": 304,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "raf"
      ],
      "begin_line": 293,
      "end_line": 293,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.DataOutputCompressor.DataOutputCompressor(java.util.zip.Deflater, java.io.DataOutput)",
      "begin_line": 295,
      "end_line": 298,
      "comment": "",
      "child_ranges": [
        "(line 296,col 13)-(line 296,col 28)",
        "(line 297,col 13)-(line 297,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.DataOutputCompressor.writeOut(byte[], int, int)",
      "begin_line": 300,
      "end_line": 303,
      "comment": "",
      "child_ranges": [
        "(line 302,col 13)-(line 302,col 44)"
      ]
    }
  ]
}