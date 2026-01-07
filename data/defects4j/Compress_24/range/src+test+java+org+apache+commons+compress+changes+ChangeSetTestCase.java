{
  "filepath": "/tmp/Compress-24b/src/test/java/org/apache/commons/compress/changes/ChangeSetTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChangeSetTestCase",
      "is_interface": false,
      "parent_types": [
        "AbstractTestCase"
      ],
      "begin_line": 46,
      "end_line": 1265,
      "comment": "\n * Checks several ChangeSet business logics.\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.archiveListDeleteDir(java.lang.String)",
      "begin_line": 49,
      "end_line": 57,
      "comment": " Delete a directory tree",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 53)",
        "(line 51,col 9)-(line 56,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.archiveListDelete(java.lang.String)",
      "begin_line": 60,
      "end_line": 68,
      "comment": " Delete a single file",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 53)",
        "(line 62,col 9)-(line 67,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddChangeTwice()",
      "begin_line": 77,
      "end_line": 102,
      "comment": "\n     * Adds an ArchiveEntry with the same name two times.\n     * Only the latest addition should be found in the ChangeSet,\n     * the first add should be replaced.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 30)",
        "(line 79,col 9)-(line 79,col 31)",
        "(line 80,col 9)-(line 101,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddChangeTwiceWithoutReplace()",
      "begin_line": 111,
      "end_line": 136,
      "comment": "\n     * Adds an ArchiveEntry with the same name two times.\n     * Only the first addition should be found in the ChangeSet,\n     * the second add should never be added since replace \u003d false\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 30)",
        "(line 113,col 9)-(line 113,col 31)",
        "(line 114,col 9)-(line 135,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteDir()",
      "begin_line": 146,
      "end_line": 179,
      "comment": "\n     * Tries to delete the folder \"bla\" from an archive file. This should result in\n     * the deletion of bla/*, which actually means bla/test4.xml should be\n     * removed from the archive. The file something/bla (without ending, named\n     * like the folder) should not be deleted.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 42)",
        "(line 148,col 9)-(line 148,col 53)",
        "(line 150,col 9)-(line 150,col 39)",
        "(line 151,col 9)-(line 151,col 38)",
        "(line 152,col 9)-(line 152,col 67)",
        "(line 153,col 9)-(line 153,col 30)",
        "(line 154,col 9)-(line 176,col 9)",
        "(line 178,col 9)-(line 178,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteDir2()",
      "begin_line": 187,
      "end_line": 220,
      "comment": "\n     * Tries to delete the folder \"la\" from an archive file. This should result in\n     * the deletion of la/*, which should not match any files/folders.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 42)",
        "(line 189,col 9)-(line 189,col 53)",
        "(line 191,col 9)-(line 191,col 39)",
        "(line 192,col 9)-(line 192,col 38)",
        "(line 193,col 9)-(line 193,col 67)",
        "(line 194,col 9)-(line 194,col 30)",
        "(line 195,col 9)-(line 217,col 9)",
        "(line 219,col 9)-(line 219,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteDir3()",
      "begin_line": 228,
      "end_line": 261,
      "comment": "\n     * Tries to delete the folder \"test.txt\" from an archive file.\n     * This should not match any files/folders.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 42)",
        "(line 230,col 9)-(line 230,col 53)",
        "(line 232,col 9)-(line 232,col 39)",
        "(line 233,col 9)-(line 233,col 38)",
        "(line 234,col 9)-(line 234,col 67)",
        "(line 235,col 9)-(line 235,col 30)",
        "(line 236,col 9)-(line 258,col 9)",
        "(line 260,col 9)-(line 260,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFile()",
      "begin_line": 269,
      "end_line": 303,
      "comment": "\n     * Tries to delete the file \"bla/test5.xml\" from an archive. This should\n     * result in the deletion of \"bla/test5.xml\".\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 42)",
        "(line 271,col 9)-(line 271,col 53)",
        "(line 273,col 9)-(line 273,col 39)",
        "(line 274,col 9)-(line 274,col 38)",
        "(line 275,col 9)-(line 275,col 67)",
        "(line 276,col 9)-(line 276,col 30)",
        "(line 277,col 9)-(line 300,col 9)",
        "(line 302,col 9)-(line 302,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFile2()",
      "begin_line": 311,
      "end_line": 345,
      "comment": "\n     * Tries to delete the file \"bla\" from an archive. This should\n     * result in the deletion of nothing.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 42)",
        "(line 313,col 9)-(line 313,col 53)",
        "(line 315,col 9)-(line 315,col 39)",
        "(line 316,col 9)-(line 316,col 38)",
        "(line 317,col 9)-(line 317,col 67)",
        "(line 318,col 9)-(line 318,col 30)",
        "(line 319,col 9)-(line 342,col 9)",
        "(line 344,col 9)-(line 344,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeletePlusAddSame()",
      "begin_line": 354,
      "end_line": 418,
      "comment": "\n     * Tries to delete and then add a file with the same name.\n     * Should delete test/test3.xml and adds test.txt with the name\n     * test/test3.xml\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 41)",
        "(line 356,col 9)-(line 356,col 53)",
        "(line 358,col 9)-(line 358,col 39)",
        "(line 359,col 9)-(line 359,col 38)",
        "(line 360,col 9)-(line 360,col 67)",
        "(line 361,col 9)-(line 361,col 30)",
        "(line 363,col 9)-(line 363,col 28)",
        "(line 364,col 9)-(line 392,col 9)",
        "(line 395,col 9)-(line 395,col 37)",
        "(line 396,col 9)-(line 396,col 26)",
        "(line 397,col 9)-(line 417,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testChangeSetResults()",
      "begin_line": 425,
      "end_line": 479,
      "comment": "\n     * Checks for the correct ChangeSetResults\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 42)",
        "(line 427,col 9)-(line 427,col 53)",
        "(line 429,col 9)-(line 429,col 39)",
        "(line 430,col 9)-(line 430,col 38)",
        "(line 431,col 9)-(line 431,col 67)",
        "(line 432,col 9)-(line 432,col 30)",
        "(line 433,col 9)-(line 476,col 9)",
        "(line 478,col 9)-(line 478,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeletePlusAdd()",
      "begin_line": 488,
      "end_line": 527,
      "comment": "\n     * Tries to delete a directory with a file and adds a new directory with a\n     * new file and with the same name. Should delete dir1/* and add\n     * dir1/test.txt at the end\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 42)",
        "(line 490,col 9)-(line 490,col 53)",
        "(line 492,col 9)-(line 492,col 39)",
        "(line 493,col 9)-(line 493,col 38)",
        "(line 494,col 9)-(line 494,col 67)",
        "(line 495,col 9)-(line 495,col 30)",
        "(line 496,col 9)-(line 524,col 9)",
        "(line 526,col 9)-(line 526,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromAndAddToZip()",
      "begin_line": 534,
      "end_line": 573,
      "comment": "\n     * Adds a file to a zip archive. Deletes an other file.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 41)",
        "(line 536,col 9)-(line 536,col 53)",
        "(line 538,col 9)-(line 538,col 39)",
        "(line 539,col 9)-(line 539,col 38)",
        "(line 540,col 9)-(line 540,col 67)",
        "(line 541,col 9)-(line 541,col 30)",
        "(line 542,col 9)-(line 570,col 9)",
        "(line 572,col 9)-(line 572,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromAndAddToZipUsingZipFilePerform()",
      "begin_line": 580,
      "end_line": 617,
      "comment": "\n     * Adds a file to a zip archive. Deletes an other file.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 41)",
        "(line 582,col 9)-(line 582,col 53)",
        "(line 584,col 9)-(line 584,col 39)",
        "(line 585,col 9)-(line 585,col 27)",
        "(line 586,col 9)-(line 586,col 67)",
        "(line 587,col 9)-(line 587,col 30)",
        "(line 588,col 9)-(line 614,col 9)",
        "(line 616,col 9)-(line 616,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddDeleteAdd()",
      "begin_line": 625,
      "end_line": 665,
      "comment": "\n     * add blub/test.txt + delete blub Should add blub/test.txt and delete it\n     * afterwards. In this example, the archive should stay untouched.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 42)",
        "(line 627,col 9)-(line 627,col 53)",
        "(line 629,col 9)-(line 629,col 39)",
        "(line 630,col 9)-(line 630,col 38)",
        "(line 631,col 9)-(line 631,col 67)",
        "(line 632,col 9)-(line 632,col 30)",
        "(line 633,col 9)-(line 662,col 9)",
        "(line 664,col 9)-(line 664,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteAddDelete()",
      "begin_line": 673,
      "end_line": 715,
      "comment": "\n     * delete bla + add bla/test.txt + delete bla Deletes dir1/* first, then\n     * suppresses the add of bla.txt because there is a delete operation later.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 674,col 9)-(line 674,col 42)",
        "(line 675,col 9)-(line 675,col 53)",
        "(line 677,col 9)-(line 677,col 39)",
        "(line 678,col 9)-(line 678,col 38)",
        "(line 679,col 9)-(line 679,col 67)",
        "(line 680,col 9)-(line 680,col 30)",
        "(line 681,col 9)-(line 712,col 9)",
        "(line 714,col 9)-(line 714,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromZip()",
      "begin_line": 722,
      "end_line": 755,
      "comment": "\n     * Simple Delete from a zip file.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 723,col 9)-(line 723,col 39)",
        "(line 724,col 9)-(line 724,col 38)",
        "(line 725,col 9)-(line 725,col 25)",
        "(line 726,col 9)-(line 749,col 9)",
        "(line 751,col 9)-(line 751,col 56)",
        "(line 752,col 9)-(line 752,col 34)",
        "(line 754,col 9)-(line 754,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromTar()",
      "begin_line": 762,
      "end_line": 792,
      "comment": "\n     * Simple delete from a tar file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 763,col 9)-(line 763,col 39)",
        "(line 764,col 9)-(line 764,col 38)",
        "(line 765,col 9)-(line 765,col 25)",
        "(line 766,col 9)-(line 788,col 9)",
        "(line 789,col 9)-(line 789,col 56)",
        "(line 790,col 9)-(line 790,col 34)",
        "(line 791,col 9)-(line 791,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromJar()",
      "begin_line": 799,
      "end_line": 832,
      "comment": "\n     * Simple delete from a jar file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 800,col 9)-(line 800,col 39)",
        "(line 801,col 9)-(line 801,col 38)",
        "(line 802,col 9)-(line 802,col 25)",
        "(line 803,col 9)-(line 828,col 9)",
        "(line 829,col 9)-(line 829,col 56)",
        "(line 830,col 9)-(line 830,col 34)",
        "(line 831,col 9)-(line 831,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromAndAddToTar()",
      "begin_line": 834,
      "end_line": 880,
      "comment": "",
      "child_ranges": [
        "(line 835,col 9)-(line 835,col 39)",
        "(line 836,col 9)-(line 836,col 38)",
        "(line 837,col 9)-(line 837,col 25)",
        "(line 838,col 9)-(line 874,col 9)",
        "(line 875,col 9)-(line 875,col 56)",
        "(line 876,col 9)-(line 876,col 34)",
        "(line 877,col 9)-(line 877,col 42)",
        "(line 878,col 9)-(line 878,col 105)",
        "(line 879,col 9)-(line 879,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromAndAddToJar()",
      "begin_line": 887,
      "end_line": 925,
      "comment": "\n     * Delete from a jar file and add another file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 888,col 9)-(line 888,col 39)",
        "(line 889,col 9)-(line 889,col 38)",
        "(line 890,col 9)-(line 890,col 25)",
        "(line 891,col 9)-(line 920,col 9)",
        "(line 921,col 9)-(line 921,col 56)",
        "(line 922,col 9)-(line 922,col 34)",
        "(line 923,col 9)-(line 923,col 42)",
        "(line 924,col 9)-(line 924,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromAr()",
      "begin_line": 932,
      "end_line": 963,
      "comment": "\n     * Simple delete from an ar file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 933,col 9)-(line 933,col 39)",
        "(line 934,col 9)-(line 934,col 38)",
        "(line 935,col 9)-(line 935,col 25)",
        "(line 936,col 9)-(line 958,col 9)",
        "(line 960,col 9)-(line 960,col 56)",
        "(line 961,col 9)-(line 961,col 34)",
        "(line 962,col 9)-(line 962,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteFromAndAddToAr()",
      "begin_line": 970,
      "end_line": 1008,
      "comment": "\n     * Deletes a file from an AR-archive and adds another\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 971,col 9)-(line 971,col 39)",
        "(line 972,col 9)-(line 972,col 38)",
        "(line 973,col 9)-(line 973,col 25)",
        "(line 974,col 9)-(line 1003,col 9)",
        "(line 1004,col 9)-(line 1004,col 56)",
        "(line 1005,col 9)-(line 1005,col 34)",
        "(line 1006,col 9)-(line 1006,col 33)",
        "(line 1007,col 9)-(line 1007,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testRenameAndDelete()",
      "begin_line": 1018,
      "end_line": 1019,
      "comment": "\n     * TODO: Move operations are not supported currently\n     * \n     * mv dir1/test.text dir2/test.txt + delete dir1 Moves the file to dir2 and\n     * deletes everything in dir1\n     * \n     * @throws Exception\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddMoveDelete()",
      "begin_line": 1031,
      "end_line": 1032,
      "comment": "\n     * TODO: Move operations are not supported currently\n     * \n     * add dir1/bla.txt + mv dir1/test.text dir2/test.txt + delete dir1\n     * \n     * Add dir1/bla.txt should be surpressed. All other dir1 files will be\n     * deleted, except dir1/test.text will be moved\n     * \n     * @throws Exception\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddToEmptyArchive()",
      "begin_line": 1039,
      "end_line": 1077,
      "comment": "\n     * Check can add a file to an empty archive.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 1040,col 9)-(line 1040,col 41)",
        "(line 1041,col 9)-(line 1041,col 58)",
        "(line 1043,col 9)-(line 1043,col 39)",
        "(line 1044,col 9)-(line 1044,col 38)",
        "(line 1045,col 9)-(line 1045,col 30)",
        "(line 1046,col 9)-(line 1046,col 67)",
        "(line 1047,col 9)-(line 1047,col 30)",
        "(line 1048,col 9)-(line 1048,col 44)",
        "(line 1049,col 9)-(line 1074,col 9)",
        "(line 1076,col 9)-(line 1076,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testDeleteAddToOneFileArchive()",
      "begin_line": 1084,
      "end_line": 1125,
      "comment": "\n     * Check can delete and add a file to an archive with a single file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 1085,col 9)-(line 1085,col 41)",
        "(line 1086,col 9)-(line 1086,col 64)",
        "(line 1088,col 9)-(line 1088,col 39)",
        "(line 1089,col 9)-(line 1089,col 38)",
        "(line 1090,col 9)-(line 1090,col 30)",
        "(line 1091,col 9)-(line 1091,col 67)",
        "(line 1092,col 9)-(line 1092,col 30)",
        "(line 1093,col 9)-(line 1093,col 44)",
        "(line 1094,col 9)-(line 1122,col 9)",
        "(line 1124,col 9)-(line 1124,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddDeleteToOneFileArchive()",
      "begin_line": 1132,
      "end_line": 1173,
      "comment": "\n     * Check can add and delete a file to an archive with a single file\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 1133,col 9)-(line 1133,col 42)",
        "(line 1134,col 9)-(line 1134,col 64)",
        "(line 1136,col 9)-(line 1136,col 39)",
        "(line 1137,col 9)-(line 1137,col 38)",
        "(line 1138,col 9)-(line 1138,col 30)",
        "(line 1139,col 9)-(line 1139,col 67)",
        "(line 1140,col 9)-(line 1140,col 30)",
        "(line 1141,col 9)-(line 1141,col 44)",
        "(line 1142,col 9)-(line 1170,col 9)",
        "(line 1172,col 9)-(line 1172,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddAllreadyExistingWithReplaceTrue()",
      "begin_line": 1181,
      "end_line": 1217,
      "comment": "\n     * Adds a file with the same filename as an existing file from the stream.\n     * Should lead to a replacement.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 1182,col 9)-(line 1182,col 41)",
        "(line 1183,col 9)-(line 1183,col 53)",
        "(line 1185,col 9)-(line 1185,col 39)",
        "(line 1186,col 9)-(line 1186,col 38)",
        "(line 1187,col 9)-(line 1187,col 67)",
        "(line 1188,col 9)-(line 1188,col 30)",
        "(line 1189,col 9)-(line 1214,col 9)",
        "(line 1216,col 9)-(line 1216,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetTestCase.testAddAllreadyExistingWithReplaceFalse()",
      "begin_line": 1225,
      "end_line": 1263,
      "comment": "\n     * Adds a file with the same filename as an existing file from the stream.\n     * Should lead to a replacement.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 1226,col 9)-(line 1226,col 41)",
        "(line 1227,col 9)-(line 1227,col 53)",
        "(line 1229,col 9)-(line 1229,col 39)",
        "(line 1230,col 9)-(line 1230,col 38)",
        "(line 1231,col 9)-(line 1231,col 67)",
        "(line 1232,col 9)-(line 1232,col 30)",
        "(line 1233,col 9)-(line 1260,col 9)",
        "(line 1262,col 9)-(line 1262,col 54)"
      ]
    }
  ]
}