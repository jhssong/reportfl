{
  "filepath": "/tmp/Compress-34b/src/main/java/org/apache/commons/compress/archivers/zip/ExplodingInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExplodingInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.InputStream"
      ],
      "begin_line": 37,
      "end_line": 158,
      "comment": "\n * The implode compression method was added to PKZIP 1.01 released in 1989.\n * It was then dropped from PKZIP 2.0 released in 1993 in favor of the deflate\n * method.\n * \u003cp\u003e\n * The algorithm is described in the ZIP File Format Specification.\n * \n * @see \u003ca href\u003d\"http://www.pkware.com/documents/casestudies/APPNOTE.TXT\"\u003eZIP File Format Specification\u003c/a\u003e\n * \n * @author Emmanuel Bourg\n * @since 1.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The underlying stream containing the compressed data "
    },
    {
      "type": "field",
      "varNames": [
        "bits"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The stream of bits read from the input stream "
    },
    {
      "type": "field",
      "varNames": [
        "dictionarySize"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " The size of the sliding dictionary (4K or 8K) "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfTrees"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " The number of Shannon-Fano trees (2 or 3) "
    },
    {
      "type": "field",
      "varNames": [
        "minimumMatchLength"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "literalTree"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " The binary tree containing the 256 encoded literals (null when only two trees are used) "
    },
    {
      "type": "field",
      "varNames": [
        "lengthTree"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " The binary tree containing the 64 encoded lengths "
    },
    {
      "type": "field",
      "varNames": [
        "distanceTree"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " The binary tree containing the 64 encoded distances "
    },
    {
      "type": "field",
      "varNames": [
        "buffer"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Output buffer holding the decompressed data "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ExplodingInputStream.ExplodingInputStream(int, int, java.io.InputStream)",
      "begin_line": 73,
      "end_line": 84,
      "comment": "\n     * Create a new stream decompressing the content of the specified stream\n     * using the explode algorithm.\n     *\n     * @param dictionarySize the size of the sliding dictionary (4096 or 8192)\n     * @param numberOfTrees  the number of trees (2 or 3)\n     * @param in             the compressed data stream\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 80,col 45)",
        "(line 81,col 9)-(line 81,col 43)",
        "(line 82,col 9)-(line 82,col 48)",
        "(line 83,col 9)-(line 83,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExplodingInputStream.init()",
      "begin_line": 91,
      "end_line": 102,
      "comment": "\n     * Reads the encoded binary trees and prepares the bit stream.\n     * \n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 101,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExplodingInputStream.read()",
      "begin_line": 104,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 108,col 9)",
        "(line 110,col 9)-(line 110,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExplodingInputStream.fillBuffer()",
      "begin_line": 117,
      "end_line": 156,
      "comment": "\n     * Fill the sliding dictionary with more data.\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 15)",
        "(line 120,col 9)-(line 120,col 33)",
        "(line 121,col 9)-(line 155,col 9)"
      ]
    }
  ]
}