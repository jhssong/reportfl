{
  "filepath": "/tmp/Codec-12b/src/main/java/org/apache/commons/codec/binary/BaseNCodecInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseNCodecInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.FilterInputStream"
      ],
      "begin_line": 31,
      "end_line": 158,
      "comment": "\n * Abstract superclass for Base-N input streams.\n * \n * @since 1.5\n "
    },
    {
      "type": "field",
      "varNames": [
        "doEncode"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "baseNCodec"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "singleByte"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.BaseNCodecInputStream.BaseNCodecInputStream(java.io.InputStream, org.apache.commons.codec.binary.BaseNCodec, boolean)",
      "begin_line": 39,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 18)",
        "(line 41,col 9)-(line 41,col 33)",
        "(line 42,col 9)-(line 42,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecInputStream.read()",
      "begin_line": 52,
      "end_line": 63,
      "comment": "\n     * Reads one \u003ccode\u003ebyte\u003c/code\u003e from this input stream.\n     * \n     * @return the byte as an integer in the range 0 to 255. Returns -1 if EOF has been reached.\n     * @throws IOException\n     *             if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 39)",
        "(line 55,col 9)-(line 57,col 9)",
        "(line 58,col 9)-(line 61,col 9)",
        "(line 62,col 9)-(line 62,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecInputStream.read(byte[], int, int)",
      "begin_line": 84,
      "end_line": 126,
      "comment": "\n     * Attempts to read \u003ccode\u003elen\u003c/code\u003e bytes into the specified \u003ccode\u003eb\u003c/code\u003e array starting at \u003ccode\u003eoffset\u003c/code\u003e\n     * from this InputStream.\n     * \n     * @param b\n     *            destination byte array\n     * @param offset\n     *            where to start writing the bytes\n     * @param len\n     *            maximum number of bytes to read\n     * \n     * @return number of bytes read\n     * @throws IOException\n     *             if an I/O error occurs.\n     * @throws NullPointerException\n     *             if the byte array parameter is null\n     * @throws IndexOutOfBoundsException\n     *             if offset, len or buffer size are invalid\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 125,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecInputStream.markSupported()",
      "begin_line": 132,
      "end_line": 135,
      "comment": "\n     * {@inheritDoc}\n     * \n     * @return false\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 21)"
      ]
    }
  ]
}