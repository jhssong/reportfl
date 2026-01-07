{
  "filepath": "/tmp/Compress-43b/src/main/java/org/apache/commons/compress/utils/ByteUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ByteUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 261,
      "comment": "\n * Utility methods for reading and writing bytes.\n * @since 1.14\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.utils.ByteUtils.ByteUtils()",
      "begin_line": 32,
      "end_line": 32,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "ByteSupplier",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 46,
      "comment": "\n     * Used to supply bytes.\n     * @since 1.14\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ByteUtils.ByteSupplier.getAsByte()",
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n         * The contract is similar to {@link InputStream#read()}, return\n         * the byte as an unsigned int, -1 if there are no more bytes.\n         * @return the supplied byte or -1 if there are no more bytes\n         * @throws IOException if supplying fails\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "ByteConsumer",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 52,
      "end_line": 60,
      "comment": "\n     * Used to consume bytes.\n     * @since 1.14\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ByteUtils.ByteConsumer.accept(int)",
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n         * The contract is similar to {@link OutputStream#write(int)},\n         * consume the lower eight bytes of the int as a byte.\n         * @param b the byte to consume\n         * @throws IOException if consuming fails\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(byte[])",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Reads the given byte array as a little endian long.\n     * @param bytes the byte array to convert\n     * @return the number read\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(byte[], int, int)",
      "begin_line": 79,
      "end_line": 86,
      "comment": "\n     * Reads the given byte array as a little endian long.\n     * @param bytes the byte array to convert\n     * @param off the offset into the array that starts the value\n     * @param length the number of bytes representing the value\n     * @return the number read\n     * @throws IllegalArgumentException if len is bigger than eight\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 32)",
        "(line 81,col 9)-(line 81,col 19)",
        "(line 82,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 85,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(java.io.InputStream, int)",
      "begin_line": 97,
      "end_line": 109,
      "comment": "\n     * Reads the given number of bytes from the given stream as a little endian long.\n     * @param in the stream to read from\n     * @param length the number of bytes representing the value\n     * @return the number read\n     * @throws IllegalArgumentException if len is bigger than eight\n     * @throws IOException if reading fails or the stream doesn\u0027t\n     * contain the given number of bytes anymore\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 32)",
        "(line 100,col 9)-(line 100,col 19)",
        "(line 101,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(org.apache.commons.compress.utils.ByteUtils.ByteSupplier, int)",
      "begin_line": 124,
      "end_line": 135,
      "comment": "\n     * Reads the given number of bytes from the given supplier as a little endian long.\n     *\n     * \u003cp\u003eTypically used by our InputStreams that need to count the\n     * bytes read as well.\u003c/p\u003e\n     *\n     * @param supplier the supplier for bytes\n     * @param length the number of bytes representing the value\n     * @return the number read\n     * @throws IllegalArgumentException if len is bigger than eight\n     * @throws IOException if the supplier fails or doesn\u0027t supply the\n     * given number of bytes anymore\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 32)",
        "(line 126,col 9)-(line 126,col 19)",
        "(line 127,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(java.io.DataInput, int)",
      "begin_line": 146,
      "end_line": 155,
      "comment": "\n     * Reads the given number of bytes from the given input as little endian long.\n     * @param in the input to read from\n     * @param length the number of bytes representing the value\n     * @return the number read\n     * @throws IllegalArgumentException if len is bigger than eight\n     * @throws IOException if reading fails or the stream doesn\u0027t\n     * contain the given number of bytes anymore\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 32)",
        "(line 149,col 9)-(line 149,col 19)",
        "(line 150,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ByteUtils.toLittleEndian(byte[], long, int, int)",
      "begin_line": 165,
      "end_line": 171,
      "comment": "\n     * Inserts the given value into the array as a little endian\n     * sequence of the given length starting at the given offset.\n     * @param b the array to write into\n     * @param value the value to insert\n     * @param off the offset into the array that receives the first byte\n     * @param length the number of bytes to use to represent the value\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 25)",
        "(line 167,col 9)-(line 170,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ByteUtils.toLittleEndian(java.io.OutputStream, long, int)",
      "begin_line": 181,
      "end_line": 189,
      "comment": "\n     * Writes the given value to the given stream as a little endian\n     * array of the given length.\n     * @param out the stream to write to\n     * @param value the value to write\n     * @param length the number of bytes to use to represent the value\n     * @throws IOException if writing fails\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 25)",
        "(line 185,col 9)-(line 188,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ByteUtils.toLittleEndian(org.apache.commons.compress.utils.ByteUtils.ByteConsumer, long, int)",
      "begin_line": 199,
      "end_line": 206,
      "comment": "\n     * Provides the given value to the given consumer as a little endian\n     * sequence of the given length.\n     * @param consumer the consumer to provide the bytes to\n     * @param value the value to provide\n     * @param length the number of bytes to use to represent the value\n     * @throws IOException if writing fails\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 25)",
        "(line 202,col 9)-(line 205,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ByteUtils.toLittleEndian(java.io.DataOutput, long, int)",
      "begin_line": 216,
      "end_line": 224,
      "comment": "\n     * Writes the given value to the given stream as a little endian\n     * array of the given length.\n     * @param out the output to write to\n     * @param value the value to write\n     * @param length the number of bytes to use to represent the value\n     * @throws IOException if writing fails\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 25)",
        "(line 220,col 9)-(line 223,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "InputStreamByteSupplier",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.utils.ByteUtils.ByteSupplier"
      ],
      "begin_line": 230,
      "end_line": 239,
      "comment": "\n     * {@link ByteSupplier} based on {@link InputStream}.\n     * @since 1.14\n     "
    },
    {
      "type": "field",
      "varNames": [
        "is"
      ],
      "begin_line": 231,
      "end_line": 231,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier.InputStreamByteSupplier(java.io.InputStream)",
      "begin_line": 232,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 233,col 13)-(line 233,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier.getAsByte()",
      "begin_line": 235,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 237,col 13)-(line 237,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OutputStreamByteConsumer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.utils.ByteUtils.ByteConsumer"
      ],
      "begin_line": 245,
      "end_line": 254,
      "comment": "\n     * {@link ByteConsumer} based on {@link OutputStream}.\n     * @since 1.14\n     "
    },
    {
      "type": "field",
      "varNames": [
        "os"
      ],
      "begin_line": 246,
      "end_line": 246,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer.OutputStreamByteConsumer(java.io.OutputStream)",
      "begin_line": 247,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 248,col 13)-(line 248,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer.accept(int)",
      "begin_line": 250,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 252,col 13)-(line 252,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ByteUtils.checkReadLength(int)",
      "begin_line": 256,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 257,col 9)-(line 259,col 9)"
      ]
    }
  ]
}