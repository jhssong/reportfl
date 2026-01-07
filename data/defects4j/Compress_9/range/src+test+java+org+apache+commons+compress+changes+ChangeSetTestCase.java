{
  "filepath": "/tmp/Compress-9b/src/test/java/org/apache/commons/compress/changes/ChangeSetTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChangeSetTestCase",
      "is_interface": false,
      "parent_types": [
        "AbstractTestCase"
      ],
      "begin_line": 45,
      "end_line": 1176,
      "comment": "\n * Checks several ChangeSet business logics.\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.archiveListDeleteDir(java.lang.String)",
      "begin_line": 48,
      "end_line": 56,
      "comment": " Delete a directory tree",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 53)",
        "(line 50,col 9)-(line 55,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.archiveListDelete(java.lang.String)",
      "begin_line": 59,
      "end_line": 67,
      "comment": " Delete a single file",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 53)",
        "(line 61,col 9)-(line 66,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddChangeTwice()",
      "begin_line": 76,
      "end_line": 99,
      "comment": "\n     * Adds an ArchiveEntry with the same name two times.\n     * Only the latest addition should be found in the ChangeSet,\n     * the first add should be replaced.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 30)",
        "(line 78,col 9)-(line 78,col 31)",
        "(line 79,col 9)-(line 98,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddChangeTwiceWithoutReplace()",
      "begin_line": 108,
      "end_line": 131,
      "comment": "\n     * Adds an ArchiveEntry with the same name two times.\n     * Only the first addition should be found in the ChangeSet,\n     * the second add should never be added since replace \u003d false\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 30)",
        "(line 110,col 9)-(line 110,col 31)",
        "(line 111,col 9)-(line 130,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteDir()",
      "begin_line": 141,
      "end_line": 172,
      "comment": "\n     * Tries to delete the folder \"bla\" from an archive file. This should result in\n     * the deletion of bla/*, which actually means bla/test4.xml should be\n     * removed from the archive. The file something/bla (without ending, named\n     * like the folder) should not be deleted.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 42)",
        "(line 143,col 9)-(line 143,col 53)",
        "(line 145,col 9)-(line 145,col 39)",
        "(line 146,col 9)-(line 146,col 38)",
        "(line 147,col 9)-(line 147,col 67)",
        "(line 148,col 9)-(line 148,col 30)",
        "(line 149,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 171,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteDir2()",
      "begin_line": 180,
      "end_line": 211,
      "comment": "\n     * Tries to delete the folder \"la\" from an archive file. This should result in\n     * the deletion of la/*, which should not match any files/folders.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 42)",
        "(line 182,col 9)-(line 182,col 53)",
        "(line 184,col 9)-(line 184,col 39)",
        "(line 185,col 9)-(line 185,col 38)",
        "(line 186,col 9)-(line 186,col 67)",
        "(line 187,col 9)-(line 187,col 30)",
        "(line 188,col 9)-(line 208,col 9)",
        "(line 210,col 9)-(line 210,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteDir3()",
      "begin_line": 219,
      "end_line": 250,
      "comment": "\n     * Tries to delete the folder \"test.txt\" from an archive file.\n     * This should not match any files/folders.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 42)",
        "(line 221,col 9)-(line 221,col 53)",
        "(line 223,col 9)-(line 223,col 39)",
        "(line 224,col 9)-(line 224,col 38)",
        "(line 225,col 9)-(line 225,col 67)",
        "(line 226,col 9)-(line 226,col 30)",
        "(line 227,col 9)-(line 247,col 9)",
        "(line 249,col 9)-(line 249,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFile()",
      "begin_line": 258,
      "end_line": 290,
      "comment": "\n     * Tries to delete the file \"bla/test5.xml\" from an archive. This should\n     * result in the deletion of \"bla/test5.xml\".\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 42)",
        "(line 260,col 9)-(line 260,col 53)",
        "(line 262,col 9)-(line 262,col 39)",
        "(line 263,col 9)-(line 263,col 38)",
        "(line 264,col 9)-(line 264,col 67)",
        "(line 265,col 9)-(line 265,col 30)",
        "(line 266,col 9)-(line 287,col 9)",
        "(line 289,col 9)-(line 289,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFile2()",
      "begin_line": 298,
      "end_line": 330,
      "comment": "\n     * Tries to delete the file \"bla\" from an archive. This should\n     * result in the deletion of nothing.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 42)",
        "(line 300,col 9)-(line 300,col 53)",
        "(line 302,col 9)-(line 302,col 39)",
        "(line 303,col 9)-(line 303,col 38)",
        "(line 304,col 9)-(line 304,col 67)",
        "(line 305,col 9)-(line 305,col 30)",
        "(line 306,col 9)-(line 327,col 9)",
        "(line 329,col 9)-(line 329,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeletePlusAddSame()",
      "begin_line": 339,
      "end_line": 401,
      "comment": "\n     * Tries to delete and then add a file with the same name.\n     * Should delete test/test3.xml and adds test.txt with the name\n     * test/test3.xml\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 41)",
        "(line 341,col 9)-(line 341,col 53)",
        "(line 343,col 9)-(line 343,col 39)",
        "(line 344,col 9)-(line 344,col 38)",
        "(line 345,col 9)-(line 345,col 67)",
        "(line 346,col 9)-(line 346,col 30)",
        "(line 348,col 9)-(line 348,col 28)",
        "(line 349,col 9)-(line 375,col 9)",
        "(line 378,col 9)-(line 378,col 37)",
        "(line 379,col 9)-(line 379,col 26)",
        "(line 380,col 9)-(line 400,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testChangeSetResults()",
      "begin_line": 408,
      "end_line": 460,
      "comment": "\n     * Checks for the correct ChangeSetResults\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 42)",
        "(line 410,col 9)-(line 410,col 53)",
        "(line 412,col 9)-(line 412,col 39)",
        "(line 413,col 9)-(line 413,col 38)",
        "(line 414,col 9)-(line 414,col 67)",
        "(line 415,col 9)-(line 415,col 30)",
        "(line 416,col 9)-(line 457,col 9)",
        "(line 459,col 9)-(line 459,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeletePlusAdd()",
      "begin_line": 469,
      "end_line": 506,
      "comment": "\n     * Tries to delete a directory with a file and adds a new directory with a\n     * new file and with the same name. Should delete dir1/* and add\n     * dir1/test.txt at the end\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 42)",
        "(line 471,col 9)-(line 471,col 53)",
        "(line 473,col 9)-(line 473,col 39)",
        "(line 474,col 9)-(line 474,col 38)",
        "(line 475,col 9)-(line 475,col 67)",
        "(line 476,col 9)-(line 476,col 30)",
        "(line 477,col 9)-(line 503,col 9)",
        "(line 505,col 9)-(line 505,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromAndAddToZip()",
      "begin_line": 513,
      "end_line": 550,
      "comment": "\n     * Adds a file to a zip archive. Deletes an other file.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 41)",
        "(line 515,col 9)-(line 515,col 53)",
        "(line 517,col 9)-(line 517,col 39)",
        "(line 518,col 9)-(line 518,col 38)",
        "(line 519,col 9)-(line 519,col 67)",
        "(line 520,col 9)-(line 520,col 30)",
        "(line 521,col 9)-(line 547,col 9)",
        "(line 549,col 9)-(line 549,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddDeleteAdd()",
      "begin_line": 558,
      "end_line": 596,
      "comment": "\n     * add blub/test.txt + delete blub Should add blub/test.txt and delete it\n     * afterwards. In this example, the archive should stay untouched.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 42)",
        "(line 560,col 9)-(line 560,col 53)",
        "(line 562,col 9)-(line 562,col 39)",
        "(line 563,col 9)-(line 563,col 38)",
        "(line 564,col 9)-(line 564,col 67)",
        "(line 565,col 9)-(line 565,col 30)",
        "(line 566,col 9)-(line 593,col 9)",
        "(line 595,col 9)-(line 595,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteAddDelete()",
      "begin_line": 604,
      "end_line": 644,
      "comment": "\n     * delete bla + add bla/test.txt + delete bla Deletes dir1/* first, then\n     * suppresses the add of bla.txt because there is a delete operation later.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 42)",
        "(line 606,col 9)-(line 606,col 53)",
        "(line 608,col 9)-(line 608,col 39)",
        "(line 609,col 9)-(line 609,col 38)",
        "(line 610,col 9)-(line 610,col 67)",
        "(line 611,col 9)-(line 611,col 30)",
        "(line 612,col 9)-(line 641,col 9)",
        "(line 643,col 9)-(line 643,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromZip()",
      "begin_line": 651,
      "end_line": 682,
      "comment": "\n     * Simple Delete from a zip file.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 652,col 9)-(line 652,col 39)",
        "(line 653,col 9)-(line 653,col 38)",
        "(line 654,col 9)-(line 654,col 25)",
        "(line 655,col 9)-(line 676,col 9)",
        "(line 678,col 9)-(line 678,col 56)",
        "(line 679,col 9)-(line 679,col 34)",
        "(line 681,col 9)-(line 681,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromTar()",
      "begin_line": 689,
      "end_line": 717,
      "comment": "\n     * Simple delete from a tar file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 39)",
        "(line 691,col 9)-(line 691,col 38)",
        "(line 692,col 9)-(line 692,col 25)",
        "(line 693,col 9)-(line 713,col 9)",
        "(line 714,col 9)-(line 714,col 56)",
        "(line 715,col 9)-(line 715,col 34)",
        "(line 716,col 9)-(line 716,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromJar()",
      "begin_line": 724,
      "end_line": 755,
      "comment": "\n     * Simple delete from a jar file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 725,col 9)-(line 725,col 39)",
        "(line 726,col 9)-(line 726,col 38)",
        "(line 727,col 9)-(line 727,col 25)",
        "(line 728,col 9)-(line 751,col 9)",
        "(line 752,col 9)-(line 752,col 56)",
        "(line 753,col 9)-(line 753,col 34)",
        "(line 754,col 9)-(line 754,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromAndAddToTar()",
      "begin_line": 757,
      "end_line": 801,
      "comment": "",
      "child_ranges": [
        "(line 758,col 9)-(line 758,col 39)",
        "(line 759,col 9)-(line 759,col 38)",
        "(line 760,col 9)-(line 760,col 25)",
        "(line 761,col 9)-(line 795,col 9)",
        "(line 796,col 9)-(line 796,col 56)",
        "(line 797,col 9)-(line 797,col 34)",
        "(line 798,col 9)-(line 798,col 42)",
        "(line 799,col 9)-(line 799,col 105)",
        "(line 800,col 9)-(line 800,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromAndAddToJar()",
      "begin_line": 808,
      "end_line": 844,
      "comment": "\n     * Delete from a jar file and add another file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 809,col 9)-(line 809,col 39)",
        "(line 810,col 9)-(line 810,col 38)",
        "(line 811,col 9)-(line 811,col 25)",
        "(line 812,col 9)-(line 839,col 9)",
        "(line 840,col 9)-(line 840,col 56)",
        "(line 841,col 9)-(line 841,col 34)",
        "(line 842,col 9)-(line 842,col 42)",
        "(line 843,col 9)-(line 843,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromAr()",
      "begin_line": 851,
      "end_line": 880,
      "comment": "\n     * Simple delete from an ar file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 852,col 9)-(line 852,col 39)",
        "(line 853,col 9)-(line 853,col 38)",
        "(line 854,col 9)-(line 854,col 25)",
        "(line 855,col 9)-(line 875,col 9)",
        "(line 877,col 9)-(line 877,col 56)",
        "(line 878,col 9)-(line 878,col 34)",
        "(line 879,col 9)-(line 879,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromAndAddToAr()",
      "begin_line": 887,
      "end_line": 923,
      "comment": "\n     * Deletes a file from an AR-archive and adds another\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 888,col 9)-(line 888,col 39)",
        "(line 889,col 9)-(line 889,col 38)",
        "(line 890,col 9)-(line 890,col 25)",
        "(line 891,col 9)-(line 918,col 9)",
        "(line 919,col 9)-(line 919,col 56)",
        "(line 920,col 9)-(line 920,col 34)",
        "(line 921,col 9)-(line 921,col 33)",
        "(line 922,col 9)-(line 922,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testRenameAndDelete()",
      "begin_line": 933,
      "end_line": 934,
      "comment": "\n     * TODO: Move operations are not supported currently\n     * \n     * mv dir1/test.text dir2/test.txt + delete dir1 Moves the file to dir2 and\n     * deletes everything in dir1\n     * \n     * @throws Exception\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddMoveDelete()",
      "begin_line": 946,
      "end_line": 947,
      "comment": "\n     * TODO: Move operations are not supported currently\n     * \n     * add dir1/bla.txt + mv dir1/test.text dir2/test.txt + delete dir1\n     * \n     * Add dir1/bla.txt should be surpressed. All other dir1 files will be\n     * deleted, except dir1/test.text will be moved\n     * \n     * @throws Exception\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddToEmptyArchive()",
      "begin_line": 954,
      "end_line": 992,
      "comment": "\n     * Check can add a file to an empty archive.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 955,col 9)-(line 955,col 41)",
        "(line 956,col 9)-(line 956,col 58)",
        "(line 958,col 9)-(line 958,col 39)",
        "(line 959,col 9)-(line 959,col 38)",
        "(line 960,col 9)-(line 960,col 30)",
        "(line 961,col 9)-(line 961,col 67)",
        "(line 962,col 9)-(line 962,col 30)",
        "(line 963,col 9)-(line 963,col 44)",
        "(line 964,col 9)-(line 989,col 9)",
        "(line 991,col 9)-(line 991,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteAddToOneFileArchive()",
      "begin_line": 999,
      "end_line": 1040,
      "comment": "\n     * Check can delete and add a file to an archive with a single file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 1000,col 9)-(line 1000,col 41)",
        "(line 1001,col 9)-(line 1001,col 64)",
        "(line 1003,col 9)-(line 1003,col 39)",
        "(line 1004,col 9)-(line 1004,col 38)",
        "(line 1005,col 9)-(line 1005,col 30)",
        "(line 1006,col 9)-(line 1006,col 67)",
        "(line 1007,col 9)-(line 1007,col 30)",
        "(line 1008,col 9)-(line 1008,col 44)",
        "(line 1009,col 9)-(line 1037,col 9)",
        "(line 1039,col 9)-(line 1039,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddDeleteToOneFileArchive()",
      "begin_line": 1047,
      "end_line": 1088,
      "comment": "\n     * Check can add and delete a file to an archive with a single file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 1048,col 9)-(line 1048,col 42)",
        "(line 1049,col 9)-(line 1049,col 64)",
        "(line 1051,col 9)-(line 1051,col 39)",
        "(line 1052,col 9)-(line 1052,col 38)",
        "(line 1053,col 9)-(line 1053,col 30)",
        "(line 1054,col 9)-(line 1054,col 67)",
        "(line 1055,col 9)-(line 1055,col 30)",
        "(line 1056,col 9)-(line 1056,col 44)",
        "(line 1057,col 9)-(line 1085,col 9)",
        "(line 1087,col 9)-(line 1087,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddAllreadyExistingWithReplaceTrue()",
      "begin_line": 1096,
      "end_line": 1130,
      "comment": "\n     * Adds a file with the same filename as an existing file from the stream.\n     * Should lead to a replacement.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 1097,col 9)-(line 1097,col 41)",
        "(line 1098,col 9)-(line 1098,col 53)",
        "(line 1100,col 9)-(line 1100,col 39)",
        "(line 1101,col 9)-(line 1101,col 38)",
        "(line 1102,col 9)-(line 1102,col 67)",
        "(line 1103,col 9)-(line 1103,col 30)",
        "(line 1104,col 9)-(line 1127,col 9)",
        "(line 1129,col 9)-(line 1129,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddAllreadyExistingWithReplaceFalse()",
      "begin_line": 1138,
      "end_line": 1174,
      "comment": "\n     * Adds a file with the same filename as an existing file from the stream.\n     * Should lead to a replacement.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 1139,col 9)-(line 1139,col 41)",
        "(line 1140,col 9)-(line 1140,col 53)",
        "(line 1142,col 9)-(line 1142,col 39)",
        "(line 1143,col 9)-(line 1143,col 38)",
        "(line 1144,col 9)-(line 1144,col 67)",
        "(line 1145,col 9)-(line 1145,col 30)",
        "(line 1146,col 9)-(line 1171,col 9)",
        "(line 1173,col 9)-(line 1173,col 54)"
      ]
    }
  ]
}