{
  "filepath": "/tmp/Compress-31b/src/main/java/org/apache/commons/compress/archivers/dump/Dirent.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Dirent",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 24,
      "end_line": 84,
      "comment": "\n * Directory entry.\n "
    },
    {
      "type": "field",
      "varNames": [
        "ino"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parentIno"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.dump.Dirent.Dirent(int, int, int, java.lang.String)",
      "begin_line": 38,
      "end_line": 43,
      "comment": "\n     * Constructor\n     *\n     * @param ino\n     * @param parentIno\n     * @param type\n     * @param name\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 23)",
        "(line 40,col 9)-(line 40,col 35)",
        "(line 41,col 9)-(line 41,col 25)",
        "(line 42,col 9)-(line 42,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.Dirent.getIno()",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Get ino.\n     * @return the i-node\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.Dirent.getParentIno()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Get ino of parent directory.\n     * @return the parent i-node\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.Dirent.getType()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Get entry type.\n     * @return the entry type\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.Dirent.getName()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Get name of directory entry.\n     * @return the directory name\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.Dirent.toString()",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\n     * @see java.lang.Object#toString()\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 52)"
      ]
    }
  ]
}