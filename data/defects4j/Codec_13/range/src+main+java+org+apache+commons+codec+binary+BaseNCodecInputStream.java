{
  "filepath": "/tmp/Codec-13b/src/main/java/org/apache/commons/codec/binary/BaseNCodecInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseNCodecInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.FilterInputStream"
      ],
      "begin_line": 34,
      "end_line": 211,
      "comment": "\n * Abstract superclass for Base-N input streams.\n *\n * @since 1.5\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "baseNCodec"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "doEncode"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "singleByte"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "context"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.BaseNCodecInputStream.BaseNCodecInputStream(java.io.InputStream, org.apache.commons.codec.binary.BaseNCodec, boolean)",
      "begin_line": 44,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 18)",
        "(line 46,col 9)-(line 46,col 33)",
        "(line 47,col 9)-(line 47,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecInputStream.available()",
      "begin_line": 57,
      "end_line": 65,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @return \u003ccode\u003e0\u003c/code\u003e if the {@link InputStream} has reached \u003ccode\u003eEOF\u003c/code\u003e,\n     * \u003ccode\u003e1\u003c/code\u003e otherwise\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecInputStream.mark(int)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Marks the current position in this input stream.\n     * \u003cp\u003eThe {@link #mark} method of {@link BaseNCodecInputStream} does nothing.\u003c/p\u003e\n     *\n     * @param readLimit the maximum limit of bytes that can be read before the mark position becomes invalid.\n     * @since 1.7\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecInputStream.markSupported()",
      "begin_line": 83,
      "end_line": 86,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @return always returns \u003ccode\u003efalse\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecInputStream.read()",
      "begin_line": 95,
      "end_line": 106,
      "comment": "\n     * Reads one \u003ccode\u003ebyte\u003c/code\u003e from this input stream.\n     *\n     * @return the byte as an integer in the range 0 to 255. Returns -1 if EOF has been reached.\n     * @throws IOException\n     *             if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 39)",
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecInputStream.read(byte[], int, int)",
      "begin_line": 127,
      "end_line": 169,
      "comment": "\n     * Attempts to read \u003ccode\u003elen\u003c/code\u003e bytes into the specified \u003ccode\u003eb\u003c/code\u003e array starting at \u003ccode\u003eoffset\u003c/code\u003e\n     * from this InputStream.\n     *\n     * @param b\n     *            destination byte array\n     * @param offset\n     *            where to start writing the bytes\n     * @param len\n     *            maximum number of bytes to read\n     *\n     * @return number of bytes read\n     * @throws IOException\n     *             if an I/O error occurs.\n     * @throws NullPointerException\n     *             if the byte array parameter is null\n     * @throws IndexOutOfBoundsException\n     *             if offset, len or buffer size are invalid\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 168,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecInputStream.reset()",
      "begin_line": 179,
      "end_line": 182,
      "comment": "\n     * Repositions this stream to the position at the time the mark method was last called on this input stream.\n     * \u003cp\u003e\n     * The {@link #reset} method of {@link BaseNCodecInputStream} does nothing except throw an {@link IOException}.\n     *\n     * @throws IOException if this method is invoked\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.BaseNCodecInputStream.skip(long)",
      "begin_line": 190,
      "end_line": 210,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws IllegalArgumentException if the provided skip length is negative\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 194,col 9)",
        "(line 197,col 9)-(line 197,col 39)",
        "(line 198,col 9)-(line 198,col 22)",
        "(line 200,col 9)-(line 207,col 9)",
        "(line 209,col 9)-(line 209,col 24)"
      ]
    }
  ]
}