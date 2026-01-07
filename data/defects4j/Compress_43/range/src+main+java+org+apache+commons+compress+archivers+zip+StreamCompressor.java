{
  "filepath": "/tmp/Compress-43b/src/main/java/org/apache/commons/compress/archivers/zip/StreamCompressor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StreamCompressor",
      "is_interface": false,
      "parent_types": [
        "java.io.Closeable"
      ],
      "begin_line": 40,
      "end_line": 340,
      "comment": "\n * Encapsulates a {@link Deflater} and crc calculator, handling multiple types of output streams.\n * Currently {@link java.util.zip.ZipEntry#DEFLATED} and {@link java.util.zip.ZipEntry#STORED} are the only\n * supported compression methods.\n *\n * @since 1.10\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFLATER_BLOCK_SIZE"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Apparently Deflater.setInput gets slowed down a lot on Sun JVMs\n     * when it gets handed a really big buffer.  See\n     * https://issues.apache.org/bugzilla/show_bug.cgi?id\u003d45396\n     *\n     * Using a buffer size of 8 kB proved to be a good compromise\n     "
    },
    {
      "type": "field",
      "varNames": [
        "def"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "writtenToOutputStreamForLastEntry"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourcePayloadLength"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "totalWrittenToOutputStream"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BUFFER_SIZE"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outputBuffer"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "readerBuf"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.StreamCompressor(java.util.zip.Deflater)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.create(java.io.OutputStream, java.util.zip.Deflater)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Create a stream compressor with the given compression level.\n     *\n     * @param os       The stream to receive output\n     * @param deflater The deflater to use\n     * @return A stream compressor\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.create(java.io.OutputStream)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Create a stream compressor with the default compression level.\n     *\n     * @param os The stream to receive output\n     * @return A stream compressor\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.create(java.io.DataOutput, java.util.zip.Deflater)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Create a stream compressor with the given compression level.\n     *\n     * @param os       The DataOutput to receive output\n     * @param deflater The deflater to use for the compressor\n     * @return A stream compressor\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.create(java.nio.channels.SeekableByteChannel, java.util.zip.Deflater)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Create a stream compressor with the given compression level.\n     *\n     * @param os       The SeekableByteChannel to receive output\n     * @param deflater The deflater to use for the compressor\n     * @return A stream compressor\n     * @since 1.13\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.create(int, org.apache.commons.compress.parallel.ScatterGatherBackingStore)",
      "begin_line": 118,
      "end_line": 121,
      "comment": "\n     * Create a stream compressor with the given compression level.\n     *\n     * @param compressionLevel The {@link Deflater}  compression level\n     * @param bs               The ScatterGatherBackingStore to receive output\n     * @return A stream compressor\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 71)",
        "(line 120,col 9)-(line 120,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.create(org.apache.commons.compress.parallel.ScatterGatherBackingStore)",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * Create a stream compressor with the default compression level.\n     *\n     * @param bs The ScatterGatherBackingStore to receive output\n     * @return A stream compressor\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.getCrc32()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.getBytesRead()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * Return the number of bytes read from the source stream\n     *\n     * @return The number of bytes read, never negative\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.getBytesWrittenForLastEntry()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * The number of bytes written to the output for the last entry\n     *\n     * @return The number of bytes, never negative\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.getTotalBytesWritten()",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * The total number of bytes written to the output for all files\n     *\n     * @return The number of bytes, never negative\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.deflate(java.io.InputStream, int)",
      "begin_line": 179,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 16)",
        "(line 181,col 9)-(line 181,col 19)",
        "(line 183,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 188,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.write(byte[], int, int, int)",
      "begin_line": 201,
      "end_line": 211,
      "comment": "\n     * Writes bytes to ZIP entry.\n     *\n     * @param b      the byte array to write\n     * @param offset the start position to write from\n     * @param length the number of bytes to write\n     * @param method the comrpession method to use\n     * @return the number of bytes written to the stream this time\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 63)",
        "(line 203,col 9)-(line 203,col 38)",
        "(line 204,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 209,col 38)",
        "(line 210,col 9)-(line 210,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.reset()",
      "begin_line": 214,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 20)",
        "(line 216,col 9)-(line 216,col 20)",
        "(line 217,col 9)-(line 217,col 32)",
        "(line 218,col 9)-(line 218,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.close()",
      "begin_line": 221,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.flushDeflater()",
      "begin_line": 226,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 21)",
        "(line 228,col 9)-(line 230,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.writeDeflated(byte[], int, int)",
      "begin_line": 233,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 235,col 9)-(line 252,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.deflateUntilInputIsNeeded()",
      "begin_line": 255,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 256,col 9)-(line 258,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.deflate()",
      "begin_line": 261,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 74)",
        "(line 263,col 9)-(line 265,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.writeCounted(byte[])",
      "begin_line": 268,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.writeCounted(byte[], int, int)",
      "begin_line": 272,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 39)",
        "(line 274,col 9)-(line 274,col 52)",
        "(line 275,col 9)-(line 275,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.writeOut(byte[], int, int)",
      "begin_line": 278,
      "end_line": 278,
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
      "begin_line": 280,
      "end_line": 293,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bs"
      ],
      "begin_line": 281,
      "end_line": 281,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.ScatterGatherBackingStoreCompressor.ScatterGatherBackingStoreCompressor(java.util.zip.Deflater, org.apache.commons.compress.parallel.ScatterGatherBackingStore)",
      "begin_line": 283,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 284,col 13)-(line 284,col 28)",
        "(line 285,col 13)-(line 285,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.ScatterGatherBackingStoreCompressor.writeOut(byte[], int, int)",
      "begin_line": 288,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 291,col 13)-(line 291,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OutputStreamCompressor",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.StreamCompressor"
      ],
      "begin_line": 295,
      "end_line": 308,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "os"
      ],
      "begin_line": 296,
      "end_line": 296,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.OutputStreamCompressor.OutputStreamCompressor(java.util.zip.Deflater, java.io.OutputStream)",
      "begin_line": 298,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 299,col 13)-(line 299,col 28)",
        "(line 300,col 13)-(line 300,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.OutputStreamCompressor.writeOut(byte[], int, int)",
      "begin_line": 303,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 306,col 13)-(line 306,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DataOutputCompressor",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.StreamCompressor"
      ],
      "begin_line": 310,
      "end_line": 323,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "raf"
      ],
      "begin_line": 311,
      "end_line": 311,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.DataOutputCompressor.DataOutputCompressor(java.util.zip.Deflater, java.io.DataOutput)",
      "begin_line": 313,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 314,col 13)-(line 314,col 28)",
        "(line 315,col 13)-(line 315,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.DataOutputCompressor.writeOut(byte[], int, int)",
      "begin_line": 318,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 321,col 13)-(line 321,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SeekableByteChannelCompressor",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.StreamCompressor"
      ],
      "begin_line": 325,
      "end_line": 339,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "channel"
      ],
      "begin_line": 326,
      "end_line": 326,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.SeekableByteChannelCompressor.SeekableByteChannelCompressor(java.util.zip.Deflater, java.nio.channels.SeekableByteChannel)",
      "begin_line": 328,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 330,col 13)-(line 330,col 28)",
        "(line 331,col 13)-(line 331,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.StreamCompressor.SeekableByteChannelCompressor.writeOut(byte[], int, int)",
      "begin_line": 334,
      "end_line": 338,
      "comment": "",
      "child_ranges": [
        "(line 337,col 13)-(line 337,col 65)"
      ]
    }
  ]
}