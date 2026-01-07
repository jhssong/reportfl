{
  "filepath": "/tmp/Compress-30b/src/main/java/org/apache/commons/compress/archivers/zip/BitStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BitStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.utils.BitInputStream"
      ],
      "begin_line": 33,
      "end_line": 61,
      "comment": "\n * Iterates over the bits of an InputStream. For each byte the bits\n * are read from the right to the left.\n *\n * @since 1.7\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.BitStream.BitStream(java.io.InputStream)",
      "begin_line": 35,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.BitStream.nextBit()",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Returns the next bit.\n     * \n     * @return The next bit (0 or 1) or -1 if the end of the stream has been reached\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.BitStream.nextBits(int)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Returns the integer value formed by the n next bits (up to 8 bits).\n     *\n     * @param n the number of bits read (up to 8)\n     * @return The value formed by the n bits, or -1 if the end of the stream has been reached\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.BitStream.nextByte()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 33)"
      ]
    }
  ]
}