{
  "filepath": "/tmp/Compress-17b/src/main/java/org/apache/commons/compress/changes/ChangeSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChangeSet",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 163,
      "comment": "\n * ChangeSet collects and performs changes to an archive.\n * Putting delete changes in this ChangeSet from multiple threads can\n * cause conflicts.\n * \n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "changes"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSet.delete(java.lang.String)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Deletes the file with the filename from the archive. \n     * \n     * @param filename\n     *            the filename of the file to delete\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSet.deleteDir(java.lang.String)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Deletes the directory tree from the archive. \n     * \n     * @param dirName\n     *            the name of the directory tree to delete\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSet.add(org.apache.commons.compress.archivers.ArchiveEntry, java.io.InputStream)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Adds a new archive entry to the archive.\n     * \n     * @param pEntry\n     *            the entry to add\n     * @param pInput\n     *            the datastream to add\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSet.add(org.apache.commons.compress.archivers.ArchiveEntry, java.io.InputStream, boolean)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Adds a new archive entry to the archive.\n     * If replace is set to true, this change will replace all other additions\n     * done in this ChangeSet and all existing entries in the original stream.\n     * \n     * @param pEntry\n     *            the entry to add\n     * @param pInput\n     *            the datastream to add\n     * @param replace\n     *            indicates the this change should replace existing entries\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSet.addAddition(org.apache.commons.compress.changes.Change)",
      "begin_line": 93,
      "end_line": 120,
      "comment": "\n     * Adds an addition change.\n     * \n     * @param pChange\n     *            the change which should result in an addition\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 97,col 9)",
        "(line 99,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSet.addDeletion(org.apache.commons.compress.changes.Change)",
      "begin_line": 128,
      "end_line": 153,
      "comment": "\n     * Adds an delete change.\n     * \n     * @param pChange\n     *            the change which should result in a deletion\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 45)",
        "(line 136,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSet.getChanges()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * Returns the list of changes as a copy. Changes on this set\n     * are not reflected on this ChangeSet and vice versa.\n     * @return the changes as a copy\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 50)"
      ]
    }
  ]
}