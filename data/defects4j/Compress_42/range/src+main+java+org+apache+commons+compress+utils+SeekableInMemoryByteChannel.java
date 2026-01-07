{
  "filepath": "/tmp/Compress-42b/src/main/java/org/apache/commons/compress/utils/SeekableInMemoryByteChannel.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SeekableInMemoryByteChannel",
      "is_interface": false,
      "parent_types": [
        "java.nio.channels.SeekableByteChannel"
      ],
      "begin_line": 38,
      "end_line": 195,
      "comment": "\n * A {@link SeekableByteChannel} implementation that wraps a byte[].\n *\n * \u003cp\u003eWhen this channel is used for writing an internal buffer grows to accommodate\n * incoming data. A natural size limit is the value of {@link Integer#MAX_VALUE}.\n * Internal buffer can be accessed via {@link SeekableInMemoryByteChannel#array()}.\u003c/p\u003e\n *\n * @since 1.13\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "NAIVE_RESIZE_LIMIT"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "position",
        "size"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.utils.SeekableInMemoryByteChannel.SeekableInMemoryByteChannel(byte[])",
      "begin_line": 54,
      "end_line": 57,
      "comment": "\n     * Constructor taking a byte array.\n     *\n     * \u003cp\u003eThis constructor is intended to be used with pre-allocated buffer or when\n     * reading from a given byte array.\u003c/p\u003e\n     *\n     * @param data input data or pre-allocated array.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 25)",
        "(line 56,col 9)-(line 56,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.utils.SeekableInMemoryByteChannel.SeekableInMemoryByteChannel()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Parameterless constructor - allocates internal buffer by itself.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.utils.SeekableInMemoryByteChannel.SeekableInMemoryByteChannel(int)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Constructor taking a size of storage to be allocated.\n     *\n     * \u003cp\u003eCreates a channel and allocates internal storage of a given size.\u003c/p\u003e\n     *\n     * @param size size of internal buffer to allocate, in bytes.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.SeekableInMemoryByteChannel.position()",
      "begin_line": 77,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.SeekableInMemoryByteChannel.position(long)",
      "begin_line": 82,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 21)",
        "(line 85,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 88,col 37)",
        "(line 89,col 9)-(line 89,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.SeekableInMemoryByteChannel.size()",
      "begin_line": 92,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.SeekableInMemoryByteChannel.truncate(long)",
      "begin_line": 97,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 32)",
        "(line 103,col 9)-(line 103,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.SeekableInMemoryByteChannel.read(java.nio.ByteBuffer)",
      "begin_line": 106,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 21)",
        "(line 109,col 9)-(line 109,col 32)",
        "(line 110,col 9)-(line 110,col 37)",
        "(line 111,col 9)-(line 111,col 39)",
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 40)",
        "(line 119,col 9)-(line 119,col 27)",
        "(line 120,col 9)-(line 120,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.SeekableInMemoryByteChannel.close()",
      "begin_line": 123,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.SeekableInMemoryByteChannel.isOpen()",
      "begin_line": 128,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.SeekableInMemoryByteChannel.write(java.nio.ByteBuffer)",
      "begin_line": 133,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 21)",
        "(line 136,col 9)-(line 136,col 35)",
        "(line 137,col 9)-(line 137,col 52)",
        "(line 138,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 38)",
        "(line 148,col 9)-(line 148,col 27)",
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.SeekableInMemoryByteChannel.array()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * Obtains the array backing this channel.\n     *\n     * \u003cp\u003eNOTE:\n     * The returned buffer is not aligned with containing data, use\n     * {@link #size()} to obtain the size of data stored in the buffer.\u003c/p\u003e\n     *\n     * @return internal byte array.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.SeekableInMemoryByteChannel.resize(int)",
      "begin_line": 168,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 30)",
        "(line 170,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.SeekableInMemoryByteChannel.ensureOpen()",
      "begin_line": 183,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 184,col 9)-(line 186,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.SeekableInMemoryByteChannel.repositionIfNecessary()",
      "begin_line": 189,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 190,col 9)-(line 192,col 9)"
      ]
    }
  ]
}