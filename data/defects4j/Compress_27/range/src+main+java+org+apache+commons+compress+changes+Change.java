{
  "filepath": "/tmp/Compress-27b/src/main/java/org/apache/commons/compress/changes/Change.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Change",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 96,
      "comment": "\n * Change holds meta information about a change.\n * \n * @Immutable\n "
    },
    {
      "type": "field",
      "varNames": [
        "targetFile"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " entry name to delete"
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " new entry to add"
    },
    {
      "type": "field",
      "varNames": [
        "input"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " source for new entry"
    },
    {
      "type": "field",
      "varNames": [
        "replaceMode"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " change should replaceMode existing entries"
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Type of change"
    },
    {
      "type": "field",
      "varNames": [
        "TYPE_DELETE"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Possible type values"
    },
    {
      "type": "field",
      "varNames": [
        "TYPE_ADD"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TYPE_MOVE"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " NOT USED"
    },
    {
      "type": "field",
      "varNames": [
        "TYPE_DELETE_DIR"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.changes.Change.Change(java.lang.String, int)",
      "begin_line": 49,
      "end_line": 58,
      "comment": "\n     * Constructor. Takes the filename of the file to be deleted\n     * from the stream as argument.\n     * @param pFilename the filename of the file to delete\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 52,col 9)",
        "(line 53,col 9)-(line 53,col 36)",
        "(line 54,col 9)-(line 54,col 25)",
        "(line 55,col 9)-(line 55,col 26)",
        "(line 56,col 9)-(line 56,col 26)",
        "(line 57,col 9)-(line 57,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.changes.Change.Change(org.apache.commons.compress.archivers.ArchiveEntry, java.io.InputStream, boolean)",
      "begin_line": 66,
      "end_line": 75,
      "comment": "\n     * Construct a change which adds an entry.\n     * \n     * @param pEntry the entry details\n     * @param pInput the InputStream for the entry data\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 70,col 28)",
        "(line 71,col 9)-(line 71,col 28)",
        "(line 72,col 9)-(line 72,col 24)",
        "(line 73,col 9)-(line 73,col 26)",
        "(line 74,col 9)-(line 74,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.Change.getEntry()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.Change.getInput()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.Change.targetFile()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.Change.type()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.Change.isReplaceMode()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 27)"
      ]
    }
  ]
}