package vues;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VueCreerListe extends JPanel {
    private JTextField nomListeField;
    private JTextArea descriptionListeArea;

    public VueCreerListe() {

        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(500, 250));

        JPanel formPanel = new JPanel(new GridLayout(4, 1));
        JLabel titreLabel = new JLabel("Entrez le nom de la liste:");
        nomListeField = new JTextField();
        JLabel descriptionLabel = new JLabel("Entrez une description de la liste:");
        descriptionListeArea = new JTextArea();

        formPanel.add(titreLabel);
        formPanel.add(nomListeField);
        formPanel.add(descriptionLabel);
        formPanel.add(descriptionListeArea);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton creerButton = new JButton("Créer");
        JButton annulerButton = new JButton("Annuler");
        buttonPanel.add(creerButton);
        buttonPanel.add(annulerButton);

        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

//        creerButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String nomListe = nomListeField.getText();
//                String descriptionListe = descriptionListeArea.getText();
//
//                // Création de la liste avec les informations spécifiées
//                JOptionPane.showMessageDialog(null, "Liste créée : " + nomListe);
//                // Mettre à jour l'interface VueTableau pour afficher la liste créée
//            }
//        });
//
//        annulerButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // Fermer la fenêtre de création de liste
//            }
//        });
    }
}
