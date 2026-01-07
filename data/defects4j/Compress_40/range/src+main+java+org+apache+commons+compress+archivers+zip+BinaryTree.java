{
  "filepath": "/tmp/Compress-40b/src/main/java/org/apache/commons/compress/archivers/zip/BinaryTree.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BinaryTree",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 189,
      "comment": "\n * Binary tree of positive values.\n * \n * @author Emmanuel Bourg\n * @since 1.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "UNDEFINED"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Value in the array indicating an undefined node "
    },
    {
      "type": "field",
      "varNames": [
        "NODE"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Value in the array indicating a non leaf node "
    },
    {
      "type": "field",
      "varNames": [
        "tree"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " \n     * The array representing the binary tree. The root is at index 0,\n     * the left children are at 2*i+1 and the right children at 2*i+2.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.BinaryTree.BinaryTree(int)",
      "begin_line": 47,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 47)",
        "(line 49,col 9)-(line 49,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.BinaryTree.addLeaf(int, int, int, int)",
      "begin_line": 60,
      "end_line": 76,
      "comment": "\n     * Adds a leaf to the tree.\n     * \n     * @param node   the index of the node where the path is appended\n     * @param path   the path to the leaf (bits are parsed from the right to the left)\n     * @param depth  the number of nodes in the path\n     * @param value  the value of the leaf (must be positive)\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 75,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.BinaryTree.read(org.apache.commons.compress.archivers.zip.BitStream)",
      "begin_line": 84,
      "end_line": 104,
      "comment": "\n     * Reads a value from the specified bit stream.\n     * \n     * @param stream\n     * @return the value decoded, or -1 if the end of the stream is reached\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 29)",
        "(line 87,col 9)-(line 103,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.BinaryTree.decode(java.io.InputStream, int)",
      "begin_line": 110,
      "end_line": 188,
      "comment": "\n     * Decodes the packed binary tree from the specified stream.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 39)",
        "(line 113,col 9)-(line 115,col 9)",
        "(line 117,col 9)-(line 117,col 50)",
        "(line 118,col 9)-(line 118,col 55)",
        "(line 121,col 9)-(line 121,col 26)",
        "(line 123,col 9)-(line 123,col 70)",
        "(line 124,col 9)-(line 124,col 20)",
        "(line 125,col 9)-(line 135,col 9)",
        "(line 138,col 9)-(line 138,col 69)",
        "(line 139,col 9)-(line 141,col 9)",
        "(line 143,col 9)-(line 143,col 18)",
        "(line 144,col 9)-(line 144,col 74)",
        "(line 145,col 9)-(line 159,col 9)",
        "(line 162,col 9)-(line 162,col 21)",
        "(line 163,col 9)-(line 163,col 30)",
        "(line 164,col 9)-(line 164,col 30)",
        "(line 166,col 9)-(line 166,col 57)",
        "(line 168,col 9)-(line 175,col 9)",
        "(line 178,col 9)-(line 178,col 58)",
        "(line 180,col 9)-(line 185,col 9)",
        "(line 187,col 9)-(line 187,col 20)"
      ]
    }
  ]
}