{
  "filepath": "/tmp/Compress-45b/src/main/java/org/apache/commons/compress/utils/FixedLengthBlockOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FixedLengthBlockOutputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.OutputStream",
        "java.nio.channels.WritableByteChannel"
      ],
      "begin_line": 50,
      "end_line": 255,
      "comment": "\n * This class supports writing to an Outputstream or WritableByteChannel in fixed length blocks.\n * \u003cp\u003eIt can be be used to support output to devices such as tape drives that require output in this\n * format. If the final block does not have enough content to fill an entire block, the output will\n * be padded to a full block size.\u003c/p\u003e\n *\n * \u003cp\u003eThis class can be used to support TAR,PAX, and CPIO blocked output to character special devices.\n * It is not recommended that this class be used unless writing to such devices, as the padding\n * serves no useful purpose in such cases.\u003c/p\u003e\n *\n * \u003cp\u003eThis class should normally wrap a FileOutputStream or associated WritableByteChannel directly.\n * If there is an intervening filter that modified the output, such as a CompressorOutputStream, or\n * performs its own buffering, such as BufferedOutputStream,  output to the device may\n * no longer be of the specified size.\u003c/p\u003e\n *\n * \u003cp\u003eAny content written to this stream should be self-delimiting and should tolerate any padding\n * added to fill the last block.\u003c/p\u003e\n *\n * @since 1.15\n "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blockSize"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "buffer"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.utils.FixedLengthBlockOutputStream.FixedLengthBlockOutputStream(java.io.OutputStream, int)",
      "begin_line": 62,
      "end_line": 72,
      "comment": "\n     * Create a fixed length block output stream with given destination stream and block size\n     * @param os   The stream to wrap.\n     * @param blockSize The block size to use.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 70,col 9)",
        "(line 71,col 9)-(line 71,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.utils.FixedLengthBlockOutputStream.FixedLengthBlockOutputStream(java.nio.channels.WritableByteChannel, int)",
      "begin_line": 78,
      "end_line": 82,
      "comment": "\n      * Create a fixed length block output stream with given destination writable byte channel and block size\n     * @param out   The writable byte channel to wrap.\n     * @param blockSize The block size to use.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 23)",
        "(line 80,col 9)-(line 80,col 35)",
        "(line 81,col 9)-(line 81,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.FixedLengthBlockOutputStream.maybeFlush()",
      "begin_line": 84,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 87,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.FixedLengthBlockOutputStream.writeBlock()",
      "begin_line": 90,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 22)",
        "(line 92,col 9)-(line 92,col 34)",
        "(line 93,col 9)-(line 93,col 53)",
        "(line 94,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 100,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.FixedLengthBlockOutputStream.write(int)",
      "begin_line": 103,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 29)",
        "(line 109,col 9)-(line 109,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.FixedLengthBlockOutputStream.write(byte[], int, int)",
      "begin_line": 112,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 123,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.FixedLengthBlockOutputStream.write(java.nio.ByteBuffer)",
      "begin_line": 126,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 43)",
        "(line 133,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.FixedLengthBlockOutputStream.isOpen()",
      "begin_line": 162,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.FixedLengthBlockOutputStream.close()",
      "begin_line": 170,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 178,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.FixedLengthBlockOutputStream.padLastBlock()",
      "begin_line": 181,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 46)",
        "(line 183,col 9)-(line 183,col 46)",
        "(line 184,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 201,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BufferAtATimeOutputChannel",
      "is_interface": false,
      "parent_types": [
        "java.nio.channels.WritableByteChannel"
      ],
      "begin_line": 210,
      "end_line": 252,
      "comment": "\n     * Helper class to provide channel wrapper for arbitrary output stream that doesn\u0027t alter the\n     * size of writes.  We can\u0027t use Channels.newChannel, because for non FileOutputStreams, it\n     * breaks up writes into 8KB max chunks. Since the purpose of this class is to always write\n     * complete blocks, we need to write a simple class to take care of it.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 213,
      "end_line": 213,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.utils.FixedLengthBlockOutputStream.BufferAtATimeOutputChannel.BufferAtATimeOutputChannel(java.io.OutputStream)",
      "begin_line": 215,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 216,col 13)-(line 216,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.FixedLengthBlockOutputStream.BufferAtATimeOutputChannel.write(java.nio.ByteBuffer)",
      "begin_line": 219,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 221,col 13)-(line 221,col 93)",
        "(line 222,col 13)-(line 223,col 78)",
        "(line 225,col 13)-(line 237,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.FixedLengthBlockOutputStream.BufferAtATimeOutputChannel.isOpen()",
      "begin_line": 240,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 242,col 13)-(line 242,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.FixedLengthBlockOutputStream.BufferAtATimeOutputChannel.close()",
      "begin_line": 245,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 247,col 13)-(line 249,col 13)"
      ]
    }
  ]
}