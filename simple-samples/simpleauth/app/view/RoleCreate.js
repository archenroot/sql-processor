/*
 * File: app/view/RoleCreate.js
 *
 * This file was generated by Sencha Architect version 2.2.2.
 * http://www.sencha.com/products/architect/
 *
 * This file requires use of the Ext JS 4.2.x library, under independent license.
 * License of Sencha Architect does not include license for Ext JS 4.2.x. For more
 * details see http://www.sencha.com/license or contact license@sencha.com.
 *
 * This file will be auto-generated each and everytime you save your project.
 *
 * Do NOT hand edit this file.
 */

Ext.define('Simpleauth.view.RoleCreate', {
    extend: 'Ext.window.Window',

    requires: [
        'Simpleauth.view.toolbar.OkCancelReset'
    ],

    id: 'RoleCreate',
    itemId: 'dialog',
    width: 400,
    closeAction: 'hide',
    iconCls: 'icon-add',
    title: 'Add Role',
    modal: true,

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'form',
                    bodyPadding: 10,
                    header: false,
                    title: 'Data',
                    api: { submit: "authWeb.createAuthRole" },
                    standardSubmit: false,
                    trackResetOnLoad: true,
                    items: [
                        {
                            xtype: 'textfield',
                            anchor: '100%',
                            fieldLabel: 'Name',
                            name: 'name',
                            allowBlank: false
                        },
                        {
                            xtype: 'textfield',
                            anchor: '100%',
                            fieldLabel: 'Description',
                            name: 'description'
                        }
                    ]
                },
                {
                    xtype: 'toolbarokcancelreset'
                }
            ]
        });

        me.callParent(arguments);
    }

});