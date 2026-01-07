{
  "filepath": "/tmp/Compress-42b/src/main/java/org/apache/commons/compress/utils/ByteUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ByteUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 176,
      "comment": "\n * Utility methods for reading and writing bytes.\n * @since 1.14\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.utils.ByteUtils.ByteUtils()",
      "begin_line": 30,
      "end_line": 30,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "ByteSupplier",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 42,
      "comment": "\n     * Used to supply bytes.\n     * @since 1.14\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ByteUtils.ByteSupplier.getAsByte()",
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n         * The contract is similar to {@link InputStream#read()}, return\n         * the byte as an unsigned int, -1 if there are no more bytes.\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "ByteConsumer",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 54,
      "comment": "\n     * Used to consume bytes.\n     * @since 1.14\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ByteUtils.ByteConsumer.accept(int)",
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n         * The contract is similar to {@link OutputStream#write(int)},\n         * consume the lower eight bytes of the int as a byte.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(byte[])",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Reads the given byte array as a little endian long.\n     * @param bytes the byte array to convert\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(byte[], int, int)",
      "begin_line": 71,
      "end_line": 80,
      "comment": "\n     * Reads the given byte array as a little endian long.\n     * @param bytes the byte array to convert\n     * @param off the offset into the array that starts the value\n     * @param length the number of bytes representing the value\n     * @throws IllegalArgumentException if len is bigger than eight\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 75,col 19)",
        "(line 76,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 79,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(java.io.InputStream, int)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Reads the given number of bytes from the given stream as a little endian long.\n     * @param in the stream to read from\n     * @param length the number of bytes representing the value\n     * @throws IllegalArgumentException if len is bigger than eight\n     * @throws IOException if reading fails or the stream doesn\u0027t\n     * contain the given number of bytes anymore\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(org.apache.commons.compress.utils.ByteUtils.ByteSupplier, int)",
      "begin_line": 102,
      "end_line": 115,
      "comment": "\n     * Reads the given number of bytes from the given supplier as a little endian long.\n     * @param supplier the supplier for bytes\n     * @param length the number of bytes representing the value\n     * @throws IllegalArgumentException if len is bigger than eight\n     * @throws IOException if the supplier fails or doesn\u0027t supply the\n     * given number of bytes anymore\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 19)",
        "(line 107,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 114,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ByteUtils.toLittleEndian(java.io.OutputStream, long, int)",
      "begin_line": 125,
      "end_line": 128,
      "comment": "\n     * Writes the given value to the given stream as a little endian\n     * array of the given length.\n     * @param out the stream to write to\n     * @param value the value to write\n     * @param length the number of bytes to use to represent the value\n     * @throws IOException if writing fails\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ByteUtils.toLittleEndian(org.apache.commons.compress.utils.ByteUtils.ByteConsumer, long, int)",
      "begin_line": 138,
      "end_line": 145,
      "comment": "\n     * Provides the given value to the given consumer as a little endian\n     * sequence of the given length.\n     * @param consumer the consumer to provide the bytes to\n     * @param value the value to provide\n     * @param length the number of bytes to use to represent the value\n     * @throws IOException if writing fails\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 25)",
        "(line 141,col 9)-(line 144,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "InputStreamByteSupplier",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.utils.ByteUtils.ByteSupplier"
      ],
      "begin_line": 151,
      "end_line": 160,
      "comment": "\n     * {@link ByteSupplier} based on {@link InputStream}.\n     * @since 1.14\n     "
    },
    {
      "type": "field",
      "varNames": [
        "is"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier.InputStreamByteSupplier(java.io.InputStream)",
      "begin_line": 153,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 13)-(line 154,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier.getAsByte()",
      "begin_line": 156,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 158,col 13)-(line 158,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OutputStreamByteConsumer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.utils.ByteUtils.ByteConsumer"
      ],
      "begin_line": 166,
      "end_line": 175,
      "comment": "\n     * {@link ByteConsumer} based on {@link OutputStream}.\n     * @since 1.14\n     "
    },
    {
      "type": "field",
      "varNames": [
        "os"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer.OutputStreamByteConsumer(java.io.OutputStream)",
      "begin_line": 168,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 169,col 13)-(line 169,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer.accept(int)",
      "begin_line": 171,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 173,col 13)-(line 173,col 24)"
      ]
    }
  ]
}