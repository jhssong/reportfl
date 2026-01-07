{
  "filepath": "/tmp/Compress-44b/src/main/java/org/apache/commons/compress/changes/ChangeSetResults.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChangeSetResults",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 93,
      "comment": "\n * Stores the results of an performed ChangeSet operation.\n "
    },
    {
      "type": "field",
      "varNames": [
        "addedFromChangeSet"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "addedFromStream"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "deleted"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetResults.deleted(java.lang.String)",
      "begin_line": 36,
      "end_line": 38,
      "comment": "\n     * Adds the filename of a recently deleted file to the result list.\n     * @param fileName the file which has been deleted\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetResults.addedFromStream(java.lang.String)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Adds the name of a file to the result list which has been \n     * copied from the source stream to the target stream.\n     * @param fileName the file name which has been added from the original stream\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetResults.addedFromChangeSet(java.lang.String)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Adds the name of a file to the result list which has been\n     * copied from the changeset to the target stream\n     * @param fileName the name of the file\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetResults.getAddedFromChangeSet()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Returns a list of filenames which has been added from the changeset\n     * @return the list of filenames\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetResults.getAddedFromStream()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Returns a list of filenames which has been added from the original stream\n     * @return the list of filenames\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetResults.getDeleted()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Returns a list of filenames which has been deleted\n     * @return the list of filenames\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetResults.hasBeenAdded(java.lang.String)",
      "begin_line": 87,
      "end_line": 92,
      "comment": "\n     * Checks if an filename already has been added to the result list\n     * @param filename the filename to check\n     * @return true, if this filename already has been added\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 91,col 21)"
      ]
    }
  ]
}