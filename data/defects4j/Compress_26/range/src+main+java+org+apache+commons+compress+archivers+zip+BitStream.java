{
  "filepath": "/tmp/Compress-26b/src/main/java/org/apache/commons/compress/archivers/zip/BitStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BitStream",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 115,
      "comment": "\n * Iterates over the bits of an InputStream. For each byte the bits\n * are read from the right to the left.\n *\n * @since 1.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bitCache"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " The bits read from the underlying stream but not consumed by nextBits() "
    },
    {
      "type": "field",
      "varNames": [
        "bitCacheSize"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The number of bits available in the bit cache "
    },
    {
      "type": "field",
      "varNames": [
        "MASKS"
      ],
      "begin_line": 42,
      "end_line": 52,
      "comment": " Bit masks for extracting the right most bits from a byte "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.BitStream.BitStream(java.io.InputStream)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.BitStream.fillCache()",
      "begin_line": 58,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 31)",
        "(line 61,col 9)-(line 70,col 9)",
        "(line 72,col 9)-(line 72,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.BitStream.nextBit()",
      "begin_line": 80,
      "end_line": 91,
      "comment": "\n     * Returns the next bit.\n     * \n     * @return The next bit (0 or 1) or -1 if the end of the stream has been reached\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 83,col 9)",
        "(line 85,col 9)-(line 85,col 39)",
        "(line 87,col 9)-(line 87,col 36)",
        "(line 88,col 9)-(line 88,col 23)",
        "(line 90,col 9)-(line 90,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.BitStream.nextBits(int)",
      "begin_line": 99,
      "end_line": 110,
      "comment": "\n     * Returns the integer value formed by the n next bits (up to 8 bits).\n     *\n     * @param n the number of bits read (up to 8)\n     * @return The value formed by the n bits, or -1 if the end of the stream has been reached\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 102,col 9)",
        "(line 104,col 9)-(line 104,col 53)",
        "(line 106,col 9)-(line 106,col 36)",
        "(line 107,col 9)-(line 107,col 40)",
        "(line 109,col 9)-(line 109,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.BitStream.nextByte()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 27)"
      ]
    }
  ]
}