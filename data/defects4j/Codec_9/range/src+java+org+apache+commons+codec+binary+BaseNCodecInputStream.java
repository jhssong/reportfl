{
  "filepath": "/tmp/Codec-9b/src/java/org/apache/commons/codec/binary/BaseNCodecInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseNCodecInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.FilterInputStream"
      ],
      "begin_line": 25,
      "end_line": 127,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "doEncode"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "baseNCodec"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "singleByte"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.BaseNCodecInputStream.BaseNCodecInputStream(java.io.InputStream, org.apache.commons.codec.binary.BaseNCodec, boolean)",
      "begin_line": 33,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 18)",
        "(line 35,col 9)-(line 35,col 33)",
        "(line 36,col 9)-(line 36,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecInputStream.read()",
      "begin_line": 46,
      "end_line": 55,
      "comment": "\n     * Reads one \u003ccode\u003ebyte\u003c/code\u003e from this input stream.\n     * \n     * @return the byte as an integer in the range 0 to 255. Returns -1 if EOF has been reached.\n     * @throws IOException\n     *             if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 39)",
        "(line 48,col 9)-(line 50,col 9)",
        "(line 51,col 9)-(line 53,col 9)",
        "(line 54,col 9)-(line 54,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecInputStream.read(byte[], int, int)",
      "begin_line": 76,
      "end_line": 117,
      "comment": "\n     * Attempts to read \u003ccode\u003elen\u003c/code\u003e bytes into the specified \u003ccode\u003eb\u003c/code\u003e array starting at \u003ccode\u003eoffset\u003c/code\u003e\n     * from this InputStream.\n     * \n     * @param b\n     *            destination byte array\n     * @param offset\n     *            where to start writing the bytes\n     * @param len\n     *            maximum number of bytes to read\n     * \n     * @return number of bytes read\n     * @throws IOException\n     *             if an I/O error occurs.\n     * @throws NullPointerException\n     *             if the byte array parameter is null\n     * @throws IndexOutOfBoundsException\n     *             if offset, len or buffer size are invalid\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 116,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecInputStream.markSupported()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * {@inheritDoc}\n     * \n     * @return false\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 21)"
      ]
    }
  ]
}